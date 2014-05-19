/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
/*
 * WARNING: The use of G.729 may require a license fee and/or royalty fee in
 * some countries and is licensed by
 * <a href="http://www.sipro.com">SIPRO Lab Telecom</a>.
 */
package org.jitsi.impl.neomedia.codec.audio.g729;

/**
 * @author Lubomir Marinov (translation of ITU-T C source code to Java)
 */
class TabLd8k
{

/* ITU-T G.729 Software Package Release 2 (November 2006) */
/*
   ITU-T G.729 Annex C - Reference C code for floating point
                         implementation of G.729
                         Version 1.01 of 15.September.98
*/

/*
----------------------------------------------------------------------
                    COPYRIGHT NOTICE
----------------------------------------------------------------------
   ITU-T G.729 Annex C ANSI C source code
   Copyright (C) 1998, AT&T, France Telecom, NTT, University of
   Sherbrooke.  All rights reserved.

----------------------------------------------------------------------
*/

/*
 File : TAB_LD8K.H
 Used for the floating point version of G.729 main body
 (not for G.729A)
*/

/* ITU-T G.729 Software Package Release 2 (November 2006) */
/*
   ITU-T G.729 Annex C - Reference C code for floating point
                         implementation of G.729
                         Version 1.01 of 15.September.98
*/

/*
----------------------------------------------------------------------
                    COPYRIGHT NOTICE
----------------------------------------------------------------------
   ITU-T G.729 Annex C ANSI C source code
   Copyright (C) 1998, AT&T, France Telecom, NTT, University of
   Sherbrooke.  All rights reserved.

u----------------------------------------------------------------------
*/

/*
 File : TAB_LD8K.C
 Used for the floating point version of G.729 main body
 (not for G.729A)
*/

static final float[/* L_WINDOW */] hamwindow = {
0.08000000f,
0.08005703f,
0.08022812f,
0.08051321f,
0.08091225f,
0.08142514f,
0.08205172f,
0.08279188f,
0.08364540f,
0.08461212f,
0.08569173f,
0.08688401f,
0.08818865f,
0.08960532f,
0.09113365f,
0.09277334f,
0.09452391f,
0.09638494f,
0.09835598f,
0.10043652f,
0.10262608f,
0.10492408f,
0.10732999f,
0.10984316f,
0.11246302f,
0.11518890f,
0.11802010f,
0.12095598f,
0.12399574f,
0.12713866f,
0.13038395f,
0.13373083f,
0.13717847f,
0.14072597f,
0.14437246f,
0.14811710f,
0.15195890f,
0.15589692f,
0.15993017f,
0.16405767f,
0.16827843f,
0.17259133f,
0.17699537f,
0.18148938f,
0.18607232f,
0.19074300f,
0.19550033f,
0.20034306f,
0.20527001f,
0.21027996f,
0.21537170f,
0.22054392f,
0.22579536f,
0.23112471f,
0.23653066f,
0.24201185f,
0.24756692f,
0.25319457f,
0.25889328f,
0.26466170f,
0.27049842f,
0.27640197f,
0.28237087f,
0.28840363f,
0.29449883f,
0.30065489f,
0.30687031f,
0.31314352f,
0.31947297f,
0.32585713f,
0.33229437f,
0.33878314f,
0.34532180f,
0.35190874f,
0.35854232f,
0.36522087f,
0.37194279f,
0.37870640f,
0.38550997f,
0.39235184f,
0.39923036f,
0.40614375f,
0.41309035f,
0.42006844f,
0.42707625f,
0.43411207f,
0.44117412f,
0.44826069f,
0.45537004f,
0.46250033f,
0.46964988f,
0.47681686f,
0.48399949f,
0.49119604f,
0.49840465f,
0.50562358f,
0.51285106f,
0.52008528f,
0.52732444f,
0.53456670f,
0.54181033f,
0.54905349f,
0.55629444f,
0.56353134f,
0.57076240f,
0.57798582f,
0.58519983f,
0.59240264f,
0.59959245f,
0.60676748f,
0.61392599f,
0.62106609f,
0.62818617f,
0.63528436f,
0.64235890f,
0.64940804f,
0.65643007f,
0.66342324f,
0.67038584f,
0.67731601f,
0.68421221f,
0.69107264f,
0.69789559f,
0.70467937f,
0.71142232f,
0.71812278f,
0.72477907f,
0.73138952f,
0.73795253f,
0.74446648f,
0.75092971f,
0.75734061f,
0.76369762f,
0.76999915f,
0.77624369f,
0.78242958f,
0.78855544f,
0.79461962f,
0.80062068f,
0.80655706f,
0.81242740f,
0.81823015f,
0.82396388f,
0.82962728f,
0.83521879f,
0.84073710f,
0.84618086f,
0.85154873f,
0.85683930f,
0.86205131f,
0.86718345f,
0.87223446f,
0.87720311f,
0.88208807f,
0.88688827f,
0.89160240f,
0.89622939f,
0.90076804f,
0.90521723f,
0.90957582f,
0.91384280f,
0.91801709f,
0.92209762f,
0.92608339f,
0.92997342f,
0.93376678f,
0.93746245f,
0.94105959f,
0.94455731f,
0.94795465f,
0.95125085f,
0.95444512f,
0.95753652f,
0.96052444f,
0.96340811f,
0.96618676f,
0.96885973f,
0.97142631f,
0.97388595f,
0.97623801f,
0.97848189f,
0.98061699f,
0.98264289f,
0.98455900f,
0.98636484f,
0.98806006f,
0.98964417f,
0.99111670f,
0.99247742f,
0.99372596f,
0.99486196f,
0.99588519f,
0.99679530f,
0.99759221f,
0.99827564f,
0.99884540f,
0.99930143f,
0.99964350f,
0.99987161f,
0.99998569f,
1.00000000f,
0.99921930f,
0.99687845f,
0.99298108f,
0.98753333f,
0.98054361f,
0.97202289f,
0.96198452f,
0.95044410f,
0.93741965f,
0.92293155f,
0.90700239f,
0.88965708f,
0.87092263f,
0.85082841f,
0.82940567f,
0.80668795f,
0.78271067f,
0.75751126f,
0.73112911f,
0.70360541f,
0.67498308f,
0.64530689f,
0.61462307f,
0.58297962f,
0.55042595f,
0.51701277f,
0.48279238f,
0.44781810f,
0.41214463f,
0.37582767f,
0.33892387f,
0.30149087f,
0.26358715f,
0.22527184f,
0.18660481f,
0.14764643f,
0.10845750f,
0.06909923f,
0.02963307f
};

static final float[/* M */] lwindow = {
0.99879038f,
0.99546894f,
0.98995779f,
0.98229335f,
0.97252620f,
0.96072035f,
0.94695264f,
0.93131180f,
0.91389754f,
0.89481964f
};

static final float[/* GRID_POINTS+1 */] grid = {
0.9997559f,
0.9986295f,
0.9945219f,
0.9876884f,
0.9781476f,
0.9659258f,
0.9510565f,
0.9335804f,
0.9135454f,
0.8910065f,
0.8660254f,
0.8386706f,
0.8090170f,
0.7771460f,
0.7431448f,
0.7071068f,
0.6691306f,
0.6293204f,
0.5877852f,
0.5446391f,
0.5000000f,
0.4539905f,
0.4067366f,
0.3583679f,
0.3090170f,
0.2588190f,
0.2079117f,
0.1564345f,
0.1045285f,
0.0523360f,
0.0000000f,
-0.0523360f,
-0.1045285f,
-0.1564345f,
-0.2079117f,
-0.2588190f,
-0.3090170f,
-0.3583679f,
-0.4067366f,
-0.4539905f,
-0.5000000f,
-0.5446391f,
-0.5877852f,
-0.6293204f,
-0.6691306f,
-0.7071068f,
-0.7431448f,
-0.7771460f,
-0.8090170f,
-0.8386706f,
-0.8660254f,
-0.8910065f,
-0.9135454f,
-0.9335804f,
-0.9510565f,
-0.9659258f,
-0.9781476f,
-0.9876884f,
-0.9945219f,
-0.9986295f,
-0.9997559f
};

/*First Stage Codebook */
static final float[/* NC0 */][/* M */] lspcb1 = {
{0.1814f,
0.2647f,
0.4580f,
1.1077f,
1.4813f,
1.7022f,
2.1953f,
2.3405f,
2.5867f,
2.6636f},

{0.2113f,
0.3223f,
0.4212f,
0.5946f,
0.7479f,
0.9615f,
1.9097f,
2.1750f,
2.4773f,
2.6737f},

{0.1915f,
0.2755f,
0.3770f,
0.5950f,
1.3505f,
1.6349f,
2.2348f,
2.3552f,
2.5768f,
2.6540f},

{0.2116f,
0.3067f,
0.4099f,
0.5748f,
0.8518f,
1.2569f,
2.0782f,
2.1920f,
2.3371f,
2.4842f},

{0.2129f,
0.2974f,
0.4039f,
1.0659f,
1.2735f,
1.4658f,
1.9061f,
2.0312f,
2.6074f,
2.6750f},

{0.2181f,
0.2893f,
0.4117f,
0.5519f,
0.8295f,
1.5825f,
2.1575f,
2.3179f,
2.5458f,
2.6417f},

{0.1991f,
0.2971f,
0.4104f,
0.7725f,
1.3073f,
1.4665f,
1.6208f,
1.6973f,
2.3732f,
2.5743f},

{0.1818f,
0.2886f,
0.4018f,
0.7630f,
1.1264f,
1.2699f,
1.6899f,
1.8650f,
2.1633f,
2.6186f},

{0.2282f,
0.3093f,
0.4243f,
0.5329f,
1.1173f,
1.7717f,
1.9420f,
2.0780f,
2.5160f,
2.6137f},

{0.2528f,
0.3693f,
0.5290f,
0.7146f,
0.9528f,
1.1269f,
1.2936f,
1.9589f,
2.4548f,
2.6653f},

{0.2332f,
0.3263f,
0.4174f,
0.5202f,
1.3633f,
1.8447f,
2.0236f,
2.1474f,
2.3572f,
2.4738f},

{0.1393f,
0.2216f,
0.3204f,
0.5644f,
0.7929f,
1.1705f,
1.7051f,
2.0054f,
2.3623f,
2.5985f},

{0.2677f,
0.3871f,
0.5746f,
0.7091f,
1.3311f,
1.5260f,
1.7288f,
1.9122f,
2.5787f,
2.6598f},

{0.1570f,
0.2328f,
0.3111f,
0.4216f,
1.1688f,
1.4605f,
1.9505f,
2.1173f,
2.4038f,
2.7460f},

{0.2346f,
0.3321f,
0.5621f,
0.8160f,
1.4042f,
1.5860f,
1.7518f,
1.8631f,
2.0749f,
2.5380f},

{0.2505f,
0.3368f,
0.4758f,
0.6405f,
0.8104f,
1.2533f,
1.9329f,
2.0526f,
2.2155f,
2.6459f},

{0.2196f,
0.3049f,
0.6857f,
1.3976f,
1.6100f,
1.7958f,
2.0813f,
2.2211f,
2.4789f,
2.5857f},

{0.1232f,
0.2011f,
0.3527f,
0.6969f,
1.1647f,
1.5081f,
1.8593f,
2.2576f,
2.5594f,
2.6896f},

{0.3682f,
0.4632f,
0.6600f,
0.9118f,
1.5245f,
1.7071f,
1.8712f,
1.9939f,
2.4356f,
2.5380f},

{0.2690f,
0.3711f,
0.4635f,
0.6644f,
1.4633f,
1.6495f,
1.8227f,
1.9983f,
2.1797f,
2.2954f},

{0.3555f,
0.5240f,
0.9751f,
1.1685f,
1.4114f,
1.6168f,
1.7769f,
2.0178f,
2.4420f,
2.5724f},

{0.3493f,
0.4404f,
0.7231f,
0.8587f,
1.1272f,
1.4715f,
1.6760f,
2.2042f,
2.4735f,
2.5604f},

{0.3747f,
0.5263f,
0.7284f,
0.8994f,
1.4017f,
1.5502f,
1.7468f,
1.9816f,
2.2380f,
2.3404f},

{0.2972f,
0.4470f,
0.5941f,
0.7078f,
1.2675f,
1.4310f,
1.5930f,
1.9126f,
2.3026f,
2.4208f},

{0.2467f,
0.3180f,
0.4712f,
1.1281f,
1.6206f,
1.7876f,
1.9544f,
2.0873f,
2.3521f,
2.4721f},

{0.2292f,
0.3430f,
0.4383f,
0.5747f,
1.3497f,
1.5187f,
1.9070f,
2.0958f,
2.2902f,
2.4301f},

{0.2573f,
0.3508f,
0.4484f,
0.7079f,
1.6577f,
1.7929f,
1.9456f,
2.0847f,
2.3060f,
2.4208f},

{0.1968f,
0.2789f,
0.3594f,
0.4361f,
1.0034f,
1.7040f,
1.9439f,
2.1044f,
2.2696f,
2.4558f},

{0.2955f,
0.3853f,
0.7986f,
1.2470f,
1.4723f,
1.6522f,
1.8684f,
2.0084f,
2.2849f,
2.4268f},

{0.2036f,
0.3189f,
0.4314f,
0.6393f,
1.2834f,
1.4278f,
1.5796f,
2.0506f,
2.2044f,
2.3656f},

{0.2916f,
0.3684f,
0.5907f,
1.1394f,
1.3933f,
1.5540f,
1.8341f,
1.9835f,
2.1301f,
2.2800f},

{0.2289f,
0.3402f,
0.5166f,
0.7716f,
1.0614f,
1.2389f,
1.4386f,
2.0769f,
2.2715f,
2.4366f},

{0.0829f,
0.1723f,
0.5682f,
0.9773f,
1.3973f,
1.6174f,
1.9242f,
2.2128f,
2.4855f,
2.6327f},

{0.2244f,
0.3169f,
0.4368f,
0.5625f,
0.6897f,
1.3763f,
1.7524f,
1.9393f,
2.5121f,
2.6556f},

{0.1591f,
0.2387f,
0.2924f,
0.4056f,
1.4677f,
1.6802f,
1.9389f,
2.2067f,
2.4635f,
2.5919f},

{0.1756f,
0.2566f,
0.3251f,
0.4227f,
1.0167f,
1.2649f,
1.6801f,
2.1055f,
2.4088f,
2.7276f},

{0.1050f,
0.2325f,
0.7445f,
0.9491f,
1.1982f,
1.4658f,
1.8093f,
2.0397f,
2.4155f,
2.5797f},

{0.2043f,
0.3324f,
0.4522f,
0.7477f,
0.9361f,
1.1533f,
1.6703f,
1.7631f,
2.5071f,
2.6528f},

{0.1522f,
0.2258f,
0.3543f,
0.5504f,
0.8815f,
1.5516f,
1.8110f,
1.9915f,
2.3603f,
2.7735f},

{0.1862f,
0.2759f,
0.4715f,
0.6908f,
0.8963f,
1.4341f,
1.6322f,
1.7630f,
2.2027f,
2.6043f},

{0.1460f,
0.2254f,
0.3790f,
0.8622f,
1.3394f,
1.5754f,
1.8084f,
2.0798f,
2.4319f,
2.7632f},

{0.2621f,
0.3792f,
0.5463f,
0.7948f,
1.0043f,
1.1921f,
1.3409f,
1.4845f,
2.3159f,
2.6002f},

{0.1935f,
0.2937f,
0.3656f,
0.4927f,
1.4015f,
1.6086f,
1.7724f,
1.8837f,
2.4374f,
2.5971f},

{0.2171f,
0.3282f,
0.4412f,
0.5713f,
1.1554f,
1.3506f,
1.5227f,
1.9923f,
2.4100f,
2.5391f},

{0.2274f,
0.3157f,
0.4263f,
0.8202f,
1.4293f,
1.5884f,
1.7535f,
1.9688f,
2.3939f,
2.4934f},

{0.1704f,
0.2633f,
0.3259f,
0.4134f,
1.2948f,
1.4802f,
1.6619f,
2.0393f,
2.3165f,
2.6083f},

{0.1763f,
0.2585f,
0.4012f,
0.7609f,
1.1503f,
1.5847f,
1.8309f,
1.9352f,
2.0982f,
2.6681f},

{0.2447f,
0.3535f,
0.4618f,
0.5979f,
0.7530f,
0.8908f,
1.5393f,
2.0075f,
2.3557f,
2.6203f},

{0.1826f,
0.3496f,
0.7764f,
0.9888f,
1.3915f,
1.7421f,
1.9412f,
2.1620f,
2.4999f,
2.6931f},

{0.3033f,
0.3802f,
0.6981f,
0.8664f,
1.0254f,
1.5401f,
1.7180f,
1.8124f,
2.5068f,
2.6119f},

{0.2960f,
0.4001f,
0.6465f,
0.7672f,
1.3782f,
1.5751f,
1.9559f,
2.1373f,
2.3601f,
2.4760f},

{0.3132f,
0.4613f,
0.6544f,
0.8532f,
1.0721f,
1.2730f,
1.7566f,
1.9217f,
2.1693f,
2.6531f},

{0.3329f,
0.4131f,
0.8073f,
1.1297f,
1.2869f,
1.4937f,
1.7885f,
1.9150f,
2.4505f,
2.5760f},

{0.2340f,
0.3605f,
0.7659f,
0.9874f,
1.1854f,
1.3337f,
1.5128f,
2.0062f,
2.4427f,
2.5859f},

{0.4131f,
0.5330f,
0.6530f,
0.9360f,
1.3648f,
1.5388f,
1.6994f,
1.8707f,
2.4294f,
2.5335f},

{0.3754f,
0.5229f,
0.7265f,
0.9301f,
1.1724f,
1.3440f,
1.5118f,
1.7098f,
2.5218f,
2.6242f},

{0.2138f,
0.2998f,
0.6283f,
1.2166f,
1.4187f,
1.6084f,
1.7992f,
2.0106f,
2.5377f,
2.6558f},

{0.1761f,
0.2672f,
0.4065f,
0.8317f,
1.0900f,
1.4814f,
1.7672f,
1.8685f,
2.3969f,
2.5079f},

{0.2801f,
0.3535f,
0.4969f,
0.9809f,
1.4934f,
1.6378f,
1.8021f,
2.1200f,
2.3135f,
2.4034f},

{0.2365f,
0.3246f,
0.5618f,
0.8176f,
1.1073f,
1.5702f,
1.7331f,
1.8592f,
1.9589f,
2.3044f},

{0.2529f,
0.3251f,
0.5147f,
1.1530f,
1.3291f,
1.5005f,
1.7028f,
1.8200f,
2.3482f,
2.4831f},

{0.2125f,
0.3041f,
0.4259f,
0.9935f,
1.1788f,
1.3615f,
1.6121f,
1.7930f,
2.5509f,
2.6742f},

{0.2685f,
0.3518f,
0.5707f,
1.0410f,
1.2270f,
1.3927f,
1.7622f,
1.8876f,
2.0985f,
2.5144f},

{0.2373f,
0.3648f,
0.5099f,
0.7373f,
0.9129f,
1.0421f,
1.7312f,
1.8984f,
2.1512f,
2.6342f},

{0.2229f,
0.3876f,
0.8621f,
1.1986f,
1.5655f,
1.8861f,
2.2376f,
2.4239f,
2.6648f,
2.7359f},

{0.3009f,
0.3719f,
0.5887f,
0.7297f,
0.9395f,
1.8797f,
2.0423f,
2.1541f,
2.5132f,
2.6026f},

{0.3114f,
0.4142f,
0.6476f,
0.8448f,
1.2495f,
1.7192f,
2.2148f,
2.3432f,
2.5246f,
2.6046f},

{0.3666f,
0.4638f,
0.6496f,
0.7858f,
0.9667f,
1.4213f,
1.9300f,
2.0564f,
2.2119f,
2.3170f},

{0.4218f,
0.5075f,
0.8348f,
1.0009f,
1.2057f,
1.5032f,
1.9416f,
2.0540f,
2.4352f,
2.5504f},

{0.3726f,
0.4602f,
0.5971f,
0.7093f,
0.8517f,
1.2361f,
1.8052f,
1.9520f,
2.4137f,
2.5518f},

{0.4482f,
0.5318f,
0.7114f,
0.8542f,
1.0328f,
1.4751f,
1.7278f,
1.8237f,
2.3496f,
2.4931f},

{0.3316f,
0.4498f,
0.6404f,
0.8162f,
1.0332f,
1.2209f,
1.5130f,
1.7250f,
1.9715f,
2.4141f},

{0.2375f,
0.3221f,
0.5042f,
0.9760f,
1.7503f,
1.9014f,
2.0822f,
2.2225f,
2.4689f,
2.5632f},

{0.2813f,
0.3575f,
0.5032f,
0.5889f,
0.6885f,
1.6040f,
1.9318f,
2.0677f,
2.4546f,
2.5701f},

{0.2198f,
0.3072f,
0.4090f,
0.6371f,
1.6365f,
1.9468f,
2.1507f,
2.2633f,
2.5063f,
2.5943f},

{0.1754f,
0.2716f,
0.3361f,
0.5550f,
1.1789f,
1.3728f,
1.8527f,
1.9919f,
2.1349f,
2.3359f},

{0.2832f,
0.3540f,
0.6080f,
0.8467f,
1.0259f,
1.6467f,
1.8987f,
1.9875f,
2.4744f,
2.5527f},

{0.2670f,
0.3564f,
0.5628f,
0.7172f,
0.9021f,
1.5328f,
1.7131f,
2.0501f,
2.5633f,
2.6574f},

{0.2729f,
0.3569f,
0.6252f,
0.7641f,
0.9887f,
1.6589f,
1.8726f,
1.9947f,
2.1884f,
2.4609f},

{0.2155f,
0.3221f,
0.4580f,
0.6995f,
0.9623f,
1.2339f,
1.6642f,
1.8823f,
2.0518f,
2.2674f},

{0.4224f,
0.7009f,
1.1714f,
1.4334f,
1.7595f,
1.9629f,
2.2185f,
2.3304f,
2.5446f,
2.6369f},

{0.4560f,
0.5403f,
0.7568f,
0.8989f,
1.1292f,
1.7687f,
1.9575f,
2.0784f,
2.4260f,
2.5484f},

{0.4299f,
0.5833f,
0.8408f,
1.0596f,
1.5524f,
1.7484f,
1.9471f,
2.2034f,
2.4617f,
2.5812f},

{0.2614f,
0.3624f,
0.8381f,
0.9829f,
1.2220f,
1.6064f,
1.8083f,
1.9362f,
2.1397f,
2.2773f},

{0.5064f,
0.7481f,
1.1021f,
1.3271f,
1.5486f,
1.7096f,
1.9503f,
2.1006f,
2.3911f,
2.5141f},

{0.5375f,
0.6552f,
0.8099f,
1.0219f,
1.2407f,
1.4160f,
1.8266f,
1.9936f,
2.1951f,
2.2911f},

{0.4994f,
0.6575f,
0.8365f,
1.0706f,
1.4116f,
1.6224f,
1.9200f,
2.0667f,
2.3262f,
2.4539f},

{0.3353f,
0.4426f,
0.6469f,
0.9161f,
1.2528f,
1.3956f,
1.6080f,
1.8909f,
2.0600f,
2.1380f},

{0.2745f,
0.4341f,
1.0424f,
1.2928f,
1.5461f,
1.7940f,
2.0161f,
2.1758f,
2.4742f,
2.5937f},

{0.1562f,
0.2393f,
0.4786f,
0.9513f,
1.2395f,
1.8010f,
2.0320f,
2.2143f,
2.5243f,
2.6204f},

{0.2979f,
0.4242f,
0.8224f,
1.0564f,
1.4881f,
1.7808f,
2.0898f,
2.1882f,
2.3328f,
2.4389f},

{0.2294f,
0.3070f,
0.5490f,
0.9244f,
1.2229f,
1.8248f,
1.9704f,
2.0627f,
2.2458f,
2.3653f},

{0.3423f,
0.4502f,
0.9144f,
1.2313f,
1.3694f,
1.5517f,
1.9907f,
2.1326f,
2.4509f,
2.5789f},

{0.2470f,
0.3275f,
0.4729f,
1.0093f,
1.2519f,
1.4216f,
1.8540f,
2.0877f,
2.3151f,
2.4156f},

{0.3447f,
0.4401f,
0.7099f,
1.0493f,
1.2312f,
1.4001f,
2.0225f,
2.1317f,
2.2894f,
2.4263f},

{0.3481f,
0.4494f,
0.6446f,
0.9336f,
1.1198f,
1.2620f,
1.8264f,
1.9712f,
2.1435f,
2.2552f},

{0.1646f,
0.3229f,
0.7112f,
1.0725f,
1.2964f,
1.5663f,
1.9843f,
2.2363f,
2.5798f,
2.7572f},

{0.2614f,
0.3707f,
0.5241f,
0.7425f,
0.9269f,
1.2976f,
2.0945f,
2.2014f,
2.6204f,
2.6959f},

{0.1963f,
0.2900f,
0.4131f,
0.8397f,
1.2171f,
1.3705f,
2.0665f,
2.1546f,
2.4640f,
2.5782f},

{0.3387f,
0.4415f,
0.6121f,
0.8005f,
0.9507f,
1.0937f,
2.0836f,
2.2342f,
2.3849f,
2.5076f},

{0.2362f,
0.5876f,
0.7574f,
0.8804f,
1.0961f,
1.4240f,
1.9519f,
2.1742f,
2.4935f,
2.6493f},

{0.2793f,
0.4282f,
0.6149f,
0.8352f,
1.0106f,
1.1766f,
1.8392f,
2.0119f,
2.6433f,
2.7117f},

{0.3603f,
0.4604f,
0.5955f,
0.9251f,
1.1006f,
1.2572f,
1.7688f,
1.8607f,
2.4687f,
2.5623f},

{0.3975f,
0.5849f,
0.8059f,
0.9182f,
1.0552f,
1.1850f,
1.6356f,
1.9627f,
2.3318f,
2.4719f},

{0.2231f,
0.3192f,
0.4256f,
0.7373f,
1.4831f,
1.6874f,
1.9765f,
2.1097f,
2.6152f,
2.6906f},

{0.1221f,
0.2081f,
0.3665f,
0.7734f,
1.0341f,
1.2818f,
1.8162f,
2.0727f,
2.4446f,
2.7377f},

{0.2010f,
0.2791f,
0.3796f,
0.8845f,
1.4030f,
1.5615f,
2.0538f,
2.1567f,
2.3171f,
2.4686f},

{0.2086f,
0.3053f,
0.4047f,
0.8224f,
1.0656f,
1.2115f,
1.9641f,
2.0871f,
2.2430f,
2.4313f},

{0.3203f,
0.4285f,
0.5467f,
0.6891f,
1.2039f,
1.3569f,
1.8578f,
2.2055f,
2.3906f,
2.4881f},

{0.3074f,
0.4192f,
0.5772f,
0.7799f,
0.9866f,
1.1335f,
1.6068f,
2.2441f,
2.4194f,
2.5089f},

{0.2108f,
0.2910f,
0.4993f,
0.7695f,
0.9528f,
1.5681f,
1.7838f,
2.1495f,
2.3522f,
2.4636f},

{0.3492f,
0.4560f,
0.5906f,
0.7379f,
0.8855f,
1.0257f,
1.7128f,
1.9997f,
2.2019f,
2.3694f},

{0.5185f,
0.7316f,
0.9708f,
1.1954f,
1.5066f,
1.7887f,
2.1396f,
2.2918f,
2.5429f,
2.6489f},

{0.4276f,
0.4946f,
0.6934f,
0.8308f,
0.9944f,
1.4582f,
2.0324f,
2.1294f,
2.4891f,
2.6324f},

{0.3847f,
0.5973f,
0.7202f,
0.8787f,
1.3938f,
1.5959f,
1.8463f,
2.1574f,
2.5050f,
2.6687f},

{0.4835f,
0.5919f,
0.7235f,
0.8862f,
1.0756f,
1.2853f,
1.9118f,
2.0215f,
2.2213f,
2.4638f},

{0.5492f,
0.8062f,
0.9810f,
1.1293f,
1.3189f,
1.5415f,
1.9385f,
2.1378f,
2.4439f,
2.5691f},

{0.5190f,
0.6764f,
0.8123f,
1.0154f,
1.2085f,
1.4266f,
1.8433f,
2.0866f,
2.5113f,
2.6474f},

{0.4602f,
0.6503f,
0.9602f,
1.1427f,
1.3043f,
1.4427f,
1.6676f,
1.8758f,
2.2868f,
2.4271f},

{0.3764f,
0.4845f,
0.7627f,
0.9914f,
1.1961f,
1.3421f,
1.5129f,
1.6707f,
2.1836f,
2.3322f},

{0.3334f,
0.5701f,
0.8622f,
1.1232f,
1.3851f,
1.6767f,
2.0600f,
2.2946f,
2.5375f,
2.7295f},

{0.1449f,
0.2719f,
0.5783f,
0.8807f,
1.1746f,
1.5422f,
1.8804f,
2.1934f,
2.4734f,
2.8728f},

{0.2333f,
0.3024f,
0.4780f,
1.2327f,
1.4180f,
1.5815f,
1.9804f,
2.0921f,
2.3524f,
2.5304f},

{0.2154f,
0.3075f,
0.4746f,
0.8477f,
1.1170f,
1.5369f,
1.9847f,
2.0733f,
2.1880f,
2.2504f},

{0.1709f,
0.4486f,
0.8705f,
1.0643f,
1.3047f,
1.5269f,
1.9175f,
2.1621f,
2.4073f,
2.5718f},

{0.2835f,
0.3752f,
0.5234f,
0.9898f,
1.1484f,
1.2974f,
1.9363f,
2.0378f,
2.4065f,
2.6214f},

{0.3211f,
0.4077f,
0.5809f,
1.0206f,
1.2542f,
1.3835f,
1.5723f,
2.1209f,
2.3464f,
2.4336f},

{0.2101f,
0.3146f,
0.6779f,
0.8783f,
1.0561f,
1.3045f,
1.8395f,
2.0695f,
2.2831f,
2.4328f}
};

/*Second Stage Codebook*/
static final float[/* NC1 */][/* M */] lspcb2 = {
{-0.0532f,
-0.0995f,
-0.0906f,
0.1261f,
-0.0633f,
0.0711f,
-0.1467f,
0.1012f,
0.0106f,
0.0470f},

{-0.1017f,
-0.1088f,
0.0566f,
-0.0010f,
-0.1528f,
0.1771f,
0.0089f,
-0.0282f,
0.1055f,
0.0808f},

{-0.1247f,
0.0283f,
-0.0374f,
0.0393f,
-0.0269f,
-0.0200f,
-0.0643f,
-0.0921f,
-0.1994f,
0.0327f},

{0.0070f,
-0.0242f,
-0.0415f,
-0.0041f,
-0.1793f,
0.0700f,
0.0972f,
-0.0207f,
-0.0771f,
0.0997f},

{0.0209f,
-0.0428f,
0.0359f,
0.2027f,
0.0554f,
0.0634f,
0.0356f,
0.0195f,
-0.0782f,
-0.1583f},

{-0.0856f,
-0.1028f,
-0.0071f,
0.1160f,
0.1089f,
0.1892f,
0.0874f,
0.0644f,
-0.0872f,
-0.0236f},

{0.0713f,
0.0039f,
-0.0353f,
0.0435f,
-0.0407f,
-0.0558f,
0.0748f,
-0.0346f,
-0.1686f,
-0.0905f},

{-0.0134f,
-0.0987f,
0.0283f,
0.0095f,
-0.0107f,
-0.0420f,
0.1638f,
0.1328f,
-0.0799f,
-0.0695f},

{-0.1049f,
0.1510f,
0.0672f,
0.1043f,
0.0872f,
-0.0663f,
-0.2139f,
-0.0239f,
-0.0120f,
-0.0338f},

{-0.1071f,
-0.1165f,
-0.1524f,
-0.0365f,
0.0260f,
-0.0288f,
-0.0889f,
0.1159f,
0.1852f,
0.1093f},

{-0.0094f,
0.0420f,
-0.0758f,
0.0932f,
0.0505f,
0.0614f,
-0.0443f,
-0.1172f,
-0.0590f,
0.1693f},

{-0.0384f,
-0.0375f,
-0.0313f,
-0.1539f,
-0.0524f,
0.0550f,
-0.0569f,
-0.0133f,
0.1233f,
0.2714f},

{0.0869f,
0.0847f,
0.0637f,
0.0794f,
0.1594f,
-0.0035f,
-0.0462f,
0.0909f,
-0.1227f,
0.0294f},

{-0.0137f,
-0.0332f,
-0.0611f,
0.1156f,
0.2116f,
0.0332f,
-0.0019f,
0.1110f,
-0.0317f,
0.2061f},

{0.0703f,
-0.0013f,
-0.0572f,
-0.0243f,
0.1345f,
-0.1235f,
0.0710f,
-0.0065f,
-0.0912f,
0.1072f},

{0.0178f,
-0.0349f,
-0.1563f,
-0.0487f,
0.0044f,
-0.0609f,
-0.1682f,
0.0023f,
-0.0542f,
0.1811f},

{-0.1384f,
-0.1020f,
0.1649f,
0.1568f,
-0.0116f,
0.1240f,
-0.0271f,
0.0541f,
0.0455f,
-0.0433f},

{-0.1782f,
-0.1511f,
0.0509f,
-0.0261f,
0.0570f,
0.0817f,
0.0805f,
0.2003f,
0.1138f,
0.0653f},

{-0.0019f,
0.0081f,
0.0572f,
0.1245f,
-0.0914f,
0.1691f,
-0.0223f,
-0.1108f,
-0.0881f,
-0.0320f},

{-0.0413f,
0.0181f,
0.1764f,
0.0092f,
-0.0928f,
0.0695f,
0.1523f,
0.0412f,
0.0508f,
-0.0148f},

{0.0476f,
0.0292f,
0.1915f,
0.1198f,
0.0139f,
0.0451f,
-0.1225f,
-0.0619f,
-0.0717f,
-0.1104f},

{-0.0382f,
-0.0120f,
0.1159f,
0.0039f,
0.1348f,
0.0088f,
-0.0173f,
0.1789f,
0.0078f,
-0.0959f},

{0.1376f,
0.0713f,
0.1020f,
0.0339f,
-0.1415f,
0.0254f,
0.0368f,
-0.1077f,
0.0143f,
-0.0494f},

{0.0658f,
-0.0140f,
0.1046f,
-0.0603f,
0.0273f,
-0.1114f,
0.0761f,
-0.0093f,
0.0338f,
-0.0538f},

{0.2683f,
0.2853f,
0.1549f,
0.0819f,
0.0372f,
-0.0327f,
-0.0642f,
0.0172f,
0.1077f,
-0.0170f},

{-0.1949f,
0.0672f,
0.0978f,
-0.0557f,
-0.0069f,
-0.0851f,
0.1057f,
0.1294f,
0.0505f,
0.0545f},

{0.1409f,
0.0724f,
-0.0094f,
0.1511f,
-0.0039f,
0.0710f,
-0.1266f,
-0.1093f,
0.0817f,
0.0363f},

{0.0485f,
0.0682f,
0.0248f,
-0.0974f,
-0.1122f,
0.0004f,
0.0845f,
-0.0357f,
0.1282f,
0.0955f},

{0.0408f,
0.1801f,
0.0772f,
-0.0098f,
0.0059f,
-0.1296f,
-0.0591f,
0.0443f,
-0.0729f,
-0.1041f},

{-0.0666f,
-0.0403f,
-0.0524f,
-0.0831f,
0.1384f,
-0.1443f,
-0.0909f,
0.1636f,
0.0320f,
0.0077f},

{0.1612f,
0.1010f,
-0.0486f,
-0.0704f,
0.0417f,
-0.0945f,
-0.0590f,
-0.1523f,
-0.0086f,
0.0120f},

{-0.0199f,
0.0823f,
-0.0014f,
-0.1082f,
0.0649f,
-0.1374f,
-0.0324f,
-0.0296f,
0.0885f,
0.1141f}
};

/*MA prediction coef.  */
static final float fg[/* MODE */][/* MA_NP */][/* M */] = {
{{0.2570f,
0.2780f,
0.2800f,
0.2736f,
0.2757f,
0.2764f,
0.2675f,
0.2678f,
0.2779f,
0.2647f},

{0.2142f,
0.2194f,
0.2331f,
0.2230f,
0.2272f,
0.2252f,
0.2148f,
0.2123f,
0.2115f,
0.2096f},

{0.1670f,
0.1523f,
0.1567f,
0.1580f,
0.1601f,
0.1569f,
0.1589f,
0.1555f,
0.1474f,
0.1571f},

{0.1238f,
0.0925f,
0.0798f,
0.0923f,
0.0890f,
0.0828f,
0.1010f,
0.0988f,
0.0872f,
0.1060f},
},

{{0.2360f,
0.2405f,
0.2499f,
0.2495f,
0.2517f,
0.2591f,
0.2636f,
0.2625f,
0.2551f,
0.2310f},

{0.1285f,
0.0925f,
0.0779f,
0.1060f,
0.1183f,
0.1176f,
0.1277f,
0.1268f,
0.1193f,
0.1211f},

{0.0981f,
0.0589f,
0.0401f,
0.0654f,
0.0761f,
0.0728f,
0.0841f,
0.0826f,
0.0776f,
0.0891f},

{0.0923f,
0.0486f,
0.0287f,
0.0498f,
0.0526f,
0.0482f,
0.0621f,
0.0636f,
0.0584f,
0.0794f},
},

};

/*present MA prediction coef.*/
static final float[/* MODE */][/* M */] fg_sum = {
{0.2380000054836f,
0.2578000128269f,
0.2504000067711f,
0.2531000375748f,
0.2480000108480f,
0.2587000429630f,
0.2577999532223f,
0.2656000256538f,
0.2760000228882f,
0.2625999450684f},

{0.4451000094414f,
0.5595000386238f,
0.6034000515938f,
0.5292999744415f,
0.5012999176979f,
0.5023000240326f,
0.4625000357628f,
0.4645000100136f,
0.4895999729633f,
0.4793999791145f}
};

/*inverse coef. */
static final float[/* MODE */][/* M */] fg_sum_inv = {
{4.2016806602478f,
3.8789758682251f,
3.9936101436615f,
3.9510068893433f,
4.0322580337524f,
3.8654806613922f,
3.8789765834808f,
3.7650599479675f,
3.6231880187988f,
3.8080739974976f},

{2.2466859817505f,
1.7873100042343f,
1.6572753190994f,
1.8892878293991f,
1.9948137998581f,
1.9908419847488f,
2.1621620655060f,
2.1528525352478f,
2.0424838066101f,
2.0859408378601f}
};

static final float[/* FIR_SIZE_ANA */] inter_3 = {
0.900839f,
0.760084f,
0.424082f,
0.084078f,
-0.105570f,
-0.121120f,
-0.047624f,
0.016285f,
0.031217f,
0.015738f,
0.000000f,
-0.005925f,
0.000000f
};

static final float[/* FIR_SIZE_SYN */] inter_3l = {
0.898517f,
0.769271f,
0.448635f,
0.095915f,
-0.134333f,
-0.178528f,
-0.084919f,
0.036952f,
0.095533f,
0.068936f,
-0.000000f,
-0.050404f,
-0.050835f,
-0.014169f,
0.023083f,
0.033543f,
0.016774f,
-0.007466f,
-0.019340f,
-0.013755f,
0.000000f,
0.009400f,
0.009029f,
0.002381f,
-0.003658f,
-0.005027f,
-0.002405f,
0.001050f,
0.002780f,
0.002145f,
0.000000f
};

static final float[/* 4 */] pred = {
0.68f,
0.58f,
0.34f,
0.19f
};

static final float[/* 2 */][/* 2 */] coef = {
{31.134575f,
1.612322f},

{0.481389f,
0.053056f}
};

static final float[/* NCODE1-NCAN1 */] thr1 = {
0.659681f,
0.755274f,
1.207205f,
1.987740f
};

static final float[/* NCODE2-NCAN2 */] thr2 = {
0.429912f,
0.494045f,
0.618737f,
0.650676f,
0.717949f,
0.770050f,
0.850628f,
0.932089f
};

static final float[/* NCODE1 */][/* 2 */] gbk1 = {
{0.000010f,
0.185084f},

{0.094719f,
0.296035f},

{0.111779f,
0.613122f},

{0.003516f,
0.659780f},

{0.117258f,
1.134277f},

{0.197901f,
1.214512f},

{0.021772f,
1.801288f},

{0.163457f,
3.315700f}
};

static final float[/* NCODE2*/][/* 2 */] gbk2 = {
{0.050466f,
0.244769f},

{0.121711f,
0.000010f},

{0.313871f,
0.072357f},

{0.375977f,
0.292399f},

{0.493870f,
0.593410f},

{0.556641f,
0.064087f},

{0.645363f,
0.362118f},

{0.706138f,
0.146110f},

{0.809357f,
0.397579f},

{0.866379f,
0.199087f},

{0.923602f,
0.599938f},

{0.925376f,
1.742757f},

{0.942028f,
0.029027f},

{0.983459f,
0.414166f},

{1.055892f,
0.227186f},

{1.158039f,
0.724592f}
};

static final float[/* SIZ_TAB_HUP_S */] tab_hup_s = {
-0.005772f,
0.087669f,
0.965882f,
-0.048753f,
-0.014793f,
0.214886f,
0.868791f,
-0.065537f,
-0.028507f,
0.374334f,
0.723418f,
-0.060834f,
-0.045567f,
0.550847f,
0.550847f,
-0.045567f,
-0.060834f,
0.723418f,
0.374334f,
-0.028507f,
-0.065537f,
0.868791f,
0.214886f,
-0.014793f,
-0.048753f,
0.965882f,
0.087669f,
-0.005772f
};

static final float[/* SIZ_TAB_HUP_L */] tab_hup_l = {
-0.001246f,
0.002200f,
-0.004791f,
0.009621f,
-0.017685f,
0.031212f,
-0.057225f,
0.135470f,
0.973955f,
-0.103495f,
0.048663f,
-0.027090f,
0.015280f,
-0.008160f,
0.003961f,
-0.001827f,
-0.002388f,
0.004479f,
-0.009715f,
0.019261f,
-0.035118f,
0.061945f,
-0.115187f,
0.294161f,
0.898322f,
-0.170283f,
0.083211f,
-0.046645f,
0.026210f,
-0.013854f,
0.006641f,
-0.003099f,
-0.003277f,
0.006456f,
-0.013906f,
0.027229f,
-0.049283f,
0.086990f,
-0.164590f,
0.464041f,
0.780309f,
-0.199879f,
0.100795f,
-0.056792f,
0.031761f,
-0.016606f,
0.007866f,
-0.003740f,
-0.003770f,
0.007714f,
-0.016462f,
0.031849f,
-0.057272f,
0.101294f,
-0.195755f,
0.630993f,
0.630993f,
-0.195755f,
0.101294f,
-0.057272f,
0.031849f,
-0.016462f,
0.007714f,
-0.003770f,
-0.003740f,
0.007866f,
-0.016606f,
0.031761f,
-0.056792f,
0.100795f,
-0.199879f,
0.780309f,
0.464041f,
-0.164590f,
0.086990f,
-0.049283f,
0.027229f,
-0.013906f,
0.006456f,
-0.003277f,
-0.003099f,
0.006641f,
-0.013854f,
0.026210f,
-0.046645f,
0.083211f,
-0.170283f,
0.898322f,
0.294161f,
-0.115187f,
0.061945f,
-0.035118f,
0.019261f,
-0.009715f,
0.004479f,
-0.002388f,
-0.001827f,
0.003961f,
-0.008160f,
0.015280f,
-0.027090f,
0.048663f,
-0.103495f,
0.973955f,
0.135470f,
-0.057225f,
0.031212f,
-0.017685f,
0.009621f,
-0.004791f,
0.002200f,
-0.001246f
};

static final int[/* NCODE1 */] map1 = {
 5, 1, 4, 7, 3, 0, 6, 2};

static final int[/* NCODE2 */] map2 = {
 4, 6, 0, 2,12,14, 8,10,15,11, 9,13, 7, 3, 1, 5};

static final int[/* NCODE1 */] imap1 = {
 5, 1, 7, 4, 2, 0, 6, 3};
static final int[/* NCODE2 */] imap2 = {
 2,14, 3,13, 0,15, 1,12, 6,10, 7, 9, 4,11, 5, 8};

static final int[/* PRM_SIZE */] bitsno = {1+Ld8k.NC0_B, /* MA + 1st stage */
                                 Ld8k.NC1_B*2, /* 2nd stage */
                                 8,1,  13,4, 7, /* first subframe  */
                                 5,    13,4, 7}; /* second subframe */

/* filter coefficients (fc = 140 Hz)  */
static final float[/* 3 */] b140 = {0.92727435E+00f, -0.18544941E+01f, 0.92727435E+00f};
static final float[/* 3 */] a140 = {1.00000000E+00f, 0.19059465E+01f, -0.91140240E+00f};

/* filter coefficients (fc = 100 Hz ) */
static final float[/* 3 */] b100 = {0.93980581E+00f, -0.18795834E+01f,  0.93980581E+00f};
static final float[/* 3 */] a100 = {1.00000000E+00f,  0.19330735E+01f, -0.93589199E+00f};
}
