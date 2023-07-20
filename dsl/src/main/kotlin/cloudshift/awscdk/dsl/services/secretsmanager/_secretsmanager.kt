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

package cloudshift.awscdk.dsl.services.secretsmanager

import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.amazon.awscdk.services.secretsmanager.CfnSecretProps
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
import software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import software.amazon.awscdk.services.secretsmanager.ResourcePolicy
import software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import software.amazon.awscdk.services.secretsmanager.SecretAttributes
import software.amazon.awscdk.services.secretsmanager.SecretProps
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps
import software.amazon.awscdk.services.secretsmanager.SecretStringGenerator
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps
import software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object secretsmanager {
    public inline fun attachedSecretOptions(block: AttachedSecretOptionsDsl.() -> Unit = {}): AttachedSecretOptions {
        val builder = AttachedSecretOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRotationSchedule(
        scope: Construct,
        id: String,
        block: CfnRotationScheduleDsl.() -> Unit = {},
    ): CfnRotationSchedule {
        val builder = CfnRotationScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRotationScheduleHostedRotationLambdaProperty(
        block: CfnRotationScheduleHostedRotationLambdaPropertyDsl.() -> Unit =
            {},
    ): CfnRotationSchedule.HostedRotationLambdaProperty {
        val builder = CfnRotationScheduleHostedRotationLambdaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRotationScheduleProps(block: CfnRotationSchedulePropsDsl.() -> Unit = {}): CfnRotationScheduleProps {
        val builder = CfnRotationSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRotationScheduleRotationRulesProperty(
        block: CfnRotationScheduleRotationRulesPropertyDsl.() -> Unit =
            {},
    ): CfnRotationSchedule.RotationRulesProperty {
        val builder = CfnRotationScheduleRotationRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecret(
        scope: Construct,
        id: String,
        block: CfnSecretDsl.() -> Unit = {},
    ): CfnSecret {
        val builder = CfnSecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecretGenerateSecretStringProperty(
        block: CfnSecretGenerateSecretStringPropertyDsl.() -> Unit =
            {},
    ): CfnSecret.GenerateSecretStringProperty {
        val builder = CfnSecretGenerateSecretStringPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecretProps(block: CfnSecretPropsDsl.() -> Unit = {}): CfnSecretProps {
        val builder = CfnSecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecretReplicaRegionProperty(
        block: CfnSecretReplicaRegionPropertyDsl.() -> Unit = {
        },
    ): CfnSecret.ReplicaRegionProperty {
        val builder = CfnSecretReplicaRegionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecretTargetAttachment(
        scope: Construct,
        id: String,
        block: CfnSecretTargetAttachmentDsl.() -> Unit = {},
    ): CfnSecretTargetAttachment {
        val builder = CfnSecretTargetAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecretTargetAttachmentProps(block: CfnSecretTargetAttachmentPropsDsl.() -> Unit = {}): CfnSecretTargetAttachmentProps {
        val builder = CfnSecretTargetAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun multiUserHostedRotationOptions(block: MultiUserHostedRotationOptionsDsl.() -> Unit = {}): MultiUserHostedRotationOptions {
        val builder = MultiUserHostedRotationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun replicaRegion(block: ReplicaRegionDsl.() -> Unit = {}): ReplicaRegion {
        val builder = ReplicaRegionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun resourcePolicy(
        scope: Construct,
        id: String,
        block: ResourcePolicyDsl.() -> Unit = {},
    ): ResourcePolicy {
        val builder = ResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun resourcePolicyProps(block: ResourcePolicyPropsDsl.() -> Unit = {}): ResourcePolicyProps {
        val builder = ResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun rotationSchedule(
        scope: Construct,
        id: String,
        block: RotationScheduleDsl.() -> Unit = {},
    ): RotationSchedule {
        val builder = RotationScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun rotationScheduleOptions(block: RotationScheduleOptionsDsl.() -> Unit = {}): RotationScheduleOptions {
        val builder = RotationScheduleOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun rotationScheduleProps(block: RotationSchedulePropsDsl.() -> Unit = {}): RotationScheduleProps {
        val builder = RotationSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secret(
        scope: Construct,
        id: String,
        block: SecretDsl.() -> Unit = {},
    ): Secret {
        val builder = SecretDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretAttachmentTargetProps(
        block: SecretAttachmentTargetPropsDsl.() -> Unit =
            {},
    ): SecretAttachmentTargetProps {
        val builder = SecretAttachmentTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretAttributes(block: SecretAttributesDsl.() -> Unit = {}): SecretAttributes {
        val builder = SecretAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretProps(block: SecretPropsDsl.() -> Unit = {}): SecretProps {
        val builder = SecretPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretRotation(
        scope: Construct,
        id: String,
        block: SecretRotationDsl.() -> Unit = {},
    ): SecretRotation {
        val builder = SecretRotationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretRotationApplication(
        applicationId: String,
        semanticVersion: String,
        block: SecretRotationApplicationDsl.() -> Unit = {},
    ): SecretRotationApplication {
        val builder = SecretRotationApplicationDsl(applicationId, semanticVersion)
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretRotationApplicationOptions(
        block: SecretRotationApplicationOptionsDsl.() -> Unit =
            {},
    ): SecretRotationApplicationOptions {
        val builder = SecretRotationApplicationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretRotationProps(block: SecretRotationPropsDsl.() -> Unit = {}): SecretRotationProps {
        val builder = SecretRotationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretStringGenerator(block: SecretStringGeneratorDsl.() -> Unit = {}): SecretStringGenerator {
        val builder = SecretStringGeneratorDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretTargetAttachment(
        scope: Construct,
        id: String,
        block: SecretTargetAttachmentDsl.() -> Unit = {},
    ): SecretTargetAttachment {
        val builder = SecretTargetAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretTargetAttachmentProps(
        block: SecretTargetAttachmentPropsDsl.() -> Unit =
            {},
    ): SecretTargetAttachmentProps {
        val builder = SecretTargetAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun singleUserHostedRotationOptions(
        block: SingleUserHostedRotationOptionsDsl.() -> Unit =
            {},
    ): SingleUserHostedRotationOptions {
        val builder = SingleUserHostedRotationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
