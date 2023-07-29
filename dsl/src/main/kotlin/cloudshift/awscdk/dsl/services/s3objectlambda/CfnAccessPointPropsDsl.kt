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

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps

/**
 * Properties for defining a `CfnAccessPoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * Object contentTransformation;
 * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
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
public class CfnAccessPointPropsDsl {
    private val cdkBuilder: CfnAccessPointProps.Builder = CfnAccessPointProps.builder()

    /** @param name The name of this access point. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     *   Point.
     */
    public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
        cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
    }

    /**
     * @param objectLambdaConfiguration A configuration used when creating an Object Lambda Access
     *   Point.
     */
    public fun objectLambdaConfiguration(
        objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty
    ) {
        cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
    }

    public fun build(): CfnAccessPointProps = cdkBuilder.build()
}
