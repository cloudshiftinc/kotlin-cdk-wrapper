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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Property key-value pairs passed into an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
 * .propertyGroupId("propertyGroupId")
 * .propertyMap(Map.of(
 * "propertyMapKey", "propertyMap"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html)
 */
@CdkDslMarker
public class CfnApplicationV2PropertyGroupPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.PropertyGroupProperty.Builder =
        CfnApplicationV2.PropertyGroupProperty.builder()

    /**
     * @param propertyGroupId Describes the key of an application execution property key-value pair.
     */
    public fun propertyGroupId(propertyGroupId: String) {
        cdkBuilder.propertyGroupId(propertyGroupId)
    }

    /**
     * @param propertyMap Describes the value of an application execution property key-value pair.
     */
    public fun propertyMap(propertyMap: Map<String, String>) {
        cdkBuilder.propertyMap(propertyMap)
    }

    /**
     * @param propertyMap Describes the value of an application execution property key-value pair.
     */
    public fun propertyMap(propertyMap: IResolvable) {
        cdkBuilder.propertyMap(propertyMap)
    }

    public fun build(): CfnApplicationV2.PropertyGroupProperty = cdkBuilder.build()
}
