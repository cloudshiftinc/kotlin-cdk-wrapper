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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The properties that are applied when Salesforce is being used as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * SalesforceSourcePropertiesProperty salesforceSourcePropertiesProperty =
 * SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationSalesforceSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.SalesforceSourcePropertiesProperty.Builder =
        CfnIntegration.SalesforceSourcePropertiesProperty.builder()

    /**
     * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
     *   added) fields in the Salesforce objects while running a flow.
     */
    public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
    }

    /**
     * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
     *   added) fields in the Salesforce objects while running a flow.
     */
    public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
    }

    /**
     * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
     *   flow run.
     */
    public fun includeDeletedRecords(includeDeletedRecords: Boolean) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
    }

    /**
     * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
     *   flow run.
     */
    public fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
    }

    /** @param object The object specified in the Salesforce flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnIntegration.SalesforceSourcePropertiesProperty = cdkBuilder.build()
}
