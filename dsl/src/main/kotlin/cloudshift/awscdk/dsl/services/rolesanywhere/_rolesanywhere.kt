@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.rolesanywhere

import software.amazon.awscdk.services.rolesanywhere.CfnCRL
import software.amazon.awscdk.services.rolesanywhere.CfnCRLProps
import software.amazon.awscdk.services.rolesanywhere.CfnProfile
import software.amazon.awscdk.services.rolesanywhere.CfnProfileProps
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object rolesanywhere {
    public inline fun cfnCRL(
        scope: Construct,
        id: String,
        block: CfnCRLDsl.() -> Unit = {},
    ): CfnCRL {
        val builder = CfnCRLDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCRLProps(block: CfnCRLPropsDsl.() -> Unit = {}): CfnCRLProps {
        val builder = CfnCRLPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProfile(
        scope: Construct,
        id: String,
        block: CfnProfileDsl.() -> Unit = {},
    ): CfnProfile {
        val builder = CfnProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnProfileProps(block: CfnProfilePropsDsl.() -> Unit = {}): CfnProfileProps {
        val builder = CfnProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrustAnchor(
        scope: Construct,
        id: String,
        block: CfnTrustAnchorDsl.() -> Unit = {},
    ): CfnTrustAnchor {
        val builder = CfnTrustAnchorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrustAnchorProps(block: CfnTrustAnchorPropsDsl.() -> Unit = {}): CfnTrustAnchorProps {
        val builder = CfnTrustAnchorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrustAnchorSourceDataProperty(
        block: CfnTrustAnchorSourceDataPropertyDsl.() -> Unit =
            {},
    ): CfnTrustAnchor.SourceDataProperty {
        val builder = CfnTrustAnchorSourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTrustAnchorSourceProperty(
        block: CfnTrustAnchorSourcePropertyDsl.() -> Unit =
            {},
    ): CfnTrustAnchor.SourceProperty {
        val builder = CfnTrustAnchorSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
