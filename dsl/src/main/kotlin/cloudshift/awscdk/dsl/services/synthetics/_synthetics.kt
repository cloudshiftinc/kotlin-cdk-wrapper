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

package cloudshift.awscdk.dsl.services.synthetics

import software.amazon.awscdk.services.synthetics.CfnCanary
import software.amazon.awscdk.services.synthetics.CfnCanaryProps
import software.amazon.awscdk.services.synthetics.CfnGroup
import software.amazon.awscdk.services.synthetics.CfnGroupProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object synthetics {
    public inline fun cfnCanary(
        scope: Construct,
        id: String,
        block: CfnCanaryDsl.() -> Unit = {},
    ): CfnCanary {
        val builder = CfnCanaryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryArtifactConfigProperty(
        block: CfnCanaryArtifactConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCanary.ArtifactConfigProperty {
        val builder = CfnCanaryArtifactConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryBaseScreenshotProperty(
        block: CfnCanaryBaseScreenshotPropertyDsl.() -> Unit =
            {},
    ): CfnCanary.BaseScreenshotProperty {
        val builder = CfnCanaryBaseScreenshotPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryCodeProperty(block: CfnCanaryCodePropertyDsl.() -> Unit = {}): CfnCanary.CodeProperty {
        val builder = CfnCanaryCodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryProps(block: CfnCanaryPropsDsl.() -> Unit = {}): CfnCanaryProps {
        val builder = CfnCanaryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryRunConfigProperty(
        block: CfnCanaryRunConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCanary.RunConfigProperty {
        val builder = CfnCanaryRunConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryS3EncryptionProperty(
        block: CfnCanaryS3EncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnCanary.S3EncryptionProperty {
        val builder = CfnCanaryS3EncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryScheduleProperty(block: CfnCanarySchedulePropertyDsl.() -> Unit = {}): CfnCanary.ScheduleProperty {
        val builder = CfnCanarySchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryVPCConfigProperty(
        block: CfnCanaryVPCConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCanary.VPCConfigProperty {
        val builder = CfnCanaryVPCConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCanaryVisualReferenceProperty(
        block: CfnCanaryVisualReferencePropertyDsl.() -> Unit =
            {},
    ): CfnCanary.VisualReferenceProperty {
        val builder = CfnCanaryVisualReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
