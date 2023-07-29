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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains configuration information about the Amazon Virtual Private Cloud (VPC).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetIdList(List.of("subnetIdList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-vpcconfiguration.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.VpcConfigurationProperty.Builder =
        CfnAnomalyDetector.VpcConfigurationProperty.builder()

    private val _securityGroupIdList: MutableList<String> = mutableListOf()

    private val _subnetIdList: MutableList<String> = mutableListOf()

    /** @param securityGroupIdList An array of strings containing the list of security groups. */
    public fun securityGroupIdList(vararg securityGroupIdList: String) {
        _securityGroupIdList.addAll(listOf(*securityGroupIdList))
    }

    /** @param securityGroupIdList An array of strings containing the list of security groups. */
    public fun securityGroupIdList(securityGroupIdList: Collection<String>) {
        _securityGroupIdList.addAll(securityGroupIdList)
    }

    /**
     * @param subnetIdList An array of strings containing the Amazon VPC subnet IDs (e.g.,
     *   `subnet-0bb1c79de3EXAMPLE` .
     */
    public fun subnetIdList(vararg subnetIdList: String) {
        _subnetIdList.addAll(listOf(*subnetIdList))
    }

    /**
     * @param subnetIdList An array of strings containing the Amazon VPC subnet IDs (e.g.,
     *   `subnet-0bb1c79de3EXAMPLE` .
     */
    public fun subnetIdList(subnetIdList: Collection<String>) {
        _subnetIdList.addAll(subnetIdList)
    }

    public fun build(): CfnAnomalyDetector.VpcConfigurationProperty {
        if (_securityGroupIdList.isNotEmpty()) cdkBuilder.securityGroupIdList(_securityGroupIdList)
        if (_subnetIdList.isNotEmpty()) cdkBuilder.subnetIdList(_subnetIdList)
        return cdkBuilder.build()
    }
}
