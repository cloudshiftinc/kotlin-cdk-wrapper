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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * VPC connection properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VpcConnectionPropertiesProperty vpcConnectionPropertiesProperty =
 * VpcConnectionPropertiesProperty.builder()
 * .vpcConnectionArn("vpcConnectionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-vpcconnectionproperties.html)
 */
@CdkDslMarker
public class CfnDataSourceVpcConnectionPropertiesPropertyDsl {
    private val cdkBuilder: CfnDataSource.VpcConnectionPropertiesProperty.Builder =
        CfnDataSource.VpcConnectionPropertiesProperty.builder()

    /** @param vpcConnectionArn The Amazon Resource Name (ARN) for the VPC connection. */
    public fun vpcConnectionArn(vpcConnectionArn: String) {
        cdkBuilder.vpcConnectionArn(vpcConnectionArn)
    }

    public fun build(): CfnDataSource.VpcConnectionPropertiesProperty = cdkBuilder.build()
}
