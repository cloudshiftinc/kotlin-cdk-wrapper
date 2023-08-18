@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3objectlambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.constructs.Construct

/**
 * The `AWS::S3ObjectLambda::AccessPoint` resource specifies an Object Lambda Access Point used to
 * access a bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * Object contentTransformation;
 * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
 * .objectLambdaConfiguration(ObjectLambdaConfigurationProperty.builder()
 * .supportingAccessPoint("supportingAccessPoint")
 * .transformationConfigurations(List.of(TransformationConfigurationProperty.builder()
 * .actions(List.of("actions"))
 * .contentTransformation(contentTransformation)
 * .build()))
 * // the properties below are optional
 * .allowedFeatures(List.of("allowedFeatures"))
 * .cloudWatchMetricsEnabled(false)
 * .build())
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html)
 */
@CdkDslMarker
public class CfnAccessPointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

    /**
     * The name of this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-name)
     *
     * @param name The name of this access point.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     *
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     *   Point.
     */
    public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
        cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
    }

    /**
     * A configuration used when creating an Object Lambda Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspoint.html#cfn-s3objectlambda-accesspoint-objectlambdaconfiguration)
     *
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     *   Point.
     */
    public fun objectLambdaConfiguration(
        objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty
    ) {
        cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
    }

    public fun build(): CfnAccessPoint = cdkBuilder.build()
}
