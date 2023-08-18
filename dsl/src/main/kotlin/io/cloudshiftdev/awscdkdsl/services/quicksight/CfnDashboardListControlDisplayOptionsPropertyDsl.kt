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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The display options of a control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ListControlDisplayOptionsProperty listControlDisplayOptionsProperty =
 * ListControlDisplayOptionsProperty.builder()
 * .searchOptions(ListControlSearchOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .selectAllOptions(ListControlSelectAllOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-listcontroldisplayoptions.html)
 */
@CdkDslMarker
public class CfnDashboardListControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ListControlDisplayOptionsProperty.Builder =
        CfnDashboard.ListControlDisplayOptionsProperty.builder()

    /** @param searchOptions The configuration of the search options in a list control. */
    public fun searchOptions(searchOptions: IResolvable) {
        cdkBuilder.searchOptions(searchOptions)
    }

    /** @param searchOptions The configuration of the search options in a list control. */
    public fun searchOptions(searchOptions: CfnDashboard.ListControlSearchOptionsProperty) {
        cdkBuilder.searchOptions(searchOptions)
    }

    /** @param selectAllOptions The configuration of the `Select all` options in a list control. */
    public fun selectAllOptions(selectAllOptions: IResolvable) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    /** @param selectAllOptions The configuration of the `Select all` options in a list control. */
    public fun selectAllOptions(
        selectAllOptions: CfnDashboard.ListControlSelectAllOptionsProperty
    ) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnDashboard.ListControlDisplayOptionsProperty = cdkBuilder.build()
}
