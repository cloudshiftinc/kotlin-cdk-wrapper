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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains a list of criteria that define when and how to cancel a configuration deployment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * IoTJobAbortConfigProperty ioTJobAbortConfigProperty = IoTJobAbortConfigProperty.builder()
 * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
 * .action("action")
 * .failureType("failureType")
 * .minNumberOfExecutedThings(123)
 * .thresholdPercentage(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortconfig.html)
 */
@CdkDslMarker
public class CfnDeploymentIoTJobAbortConfigPropertyDsl {
    private val cdkBuilder: CfnDeployment.IoTJobAbortConfigProperty.Builder =
        CfnDeployment.IoTJobAbortConfigProperty.builder()

    private val _criteriaList: MutableList<Any> = mutableListOf()

    /**
     * @param criteriaList The list of criteria that define when and how to cancel the configuration
     *   deployment.
     */
    public fun criteriaList(vararg criteriaList: Any) {
        _criteriaList.addAll(listOf(*criteriaList))
    }

    /**
     * @param criteriaList The list of criteria that define when and how to cancel the configuration
     *   deployment.
     */
    public fun criteriaList(criteriaList: Collection<Any>) {
        _criteriaList.addAll(criteriaList)
    }

    /**
     * @param criteriaList The list of criteria that define when and how to cancel the configuration
     *   deployment.
     */
    public fun criteriaList(criteriaList: IResolvable) {
        cdkBuilder.criteriaList(criteriaList)
    }

    public fun build(): CfnDeployment.IoTJobAbortConfigProperty {
        if (_criteriaList.isNotEmpty()) cdkBuilder.criteriaList(_criteriaList)
        return cdkBuilder.build()
    }
}
