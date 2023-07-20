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

package cloudshift.awscdk.dsl.services.s3objectlambda

import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object s3objectlambda {
    public inline fun cfnAccessPoint(
        scope: Construct,
        id: String,
        block: CfnAccessPointDsl.() -> Unit = {},
    ): CfnAccessPoint {
        val builder = CfnAccessPointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointAliasProperty(
        block: CfnAccessPointAliasPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.AliasProperty {
        val builder = CfnAccessPointAliasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointAwsLambdaProperty(
        block: CfnAccessPointAwsLambdaPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.AwsLambdaProperty {
        val builder = CfnAccessPointAwsLambdaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointContentTransformationProperty(
        block: CfnAccessPointContentTransformationPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.ContentTransformationProperty {
        val builder = CfnAccessPointContentTransformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointObjectLambdaConfigurationProperty(
        block: CfnAccessPointObjectLambdaConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.ObjectLambdaConfigurationProperty {
        val builder = CfnAccessPointObjectLambdaConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointPolicy(
        scope: Construct,
        id: String,
        block: CfnAccessPointPolicyDsl.() -> Unit = {},
    ): CfnAccessPointPolicy {
        val builder = CfnAccessPointPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointPolicyProps(block: CfnAccessPointPolicyPropsDsl.() -> Unit = {}): CfnAccessPointPolicyProps {
        val builder = CfnAccessPointPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointPolicyStatusProperty(
        block: CfnAccessPointPolicyStatusPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.PolicyStatusProperty {
        val builder = CfnAccessPointPolicyStatusPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointProps(block: CfnAccessPointPropsDsl.() -> Unit = {}): CfnAccessPointProps {
        val builder = CfnAccessPointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointPublicAccessBlockConfigurationProperty(
        block: CfnAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.PublicAccessBlockConfigurationProperty {
        val builder = CfnAccessPointPublicAccessBlockConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointTransformationConfigurationProperty(
        block: CfnAccessPointTransformationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.TransformationConfigurationProperty {
        val builder = CfnAccessPointTransformationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
