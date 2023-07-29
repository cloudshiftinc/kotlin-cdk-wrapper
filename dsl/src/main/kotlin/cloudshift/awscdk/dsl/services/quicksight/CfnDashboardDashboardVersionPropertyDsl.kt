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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Dashboard version.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DashboardVersionProperty dashboardVersionProperty = DashboardVersionProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .dataSetArns(List.of("dataSetArns"))
 * .description("description")
 * .errors(List.of(DashboardErrorProperty.builder()
 * .message("message")
 * .type("type")
 * .violatedEntities(List.of(EntityProperty.builder()
 * .path("path")
 * .build()))
 * .build()))
 * .sheets(List.of(SheetProperty.builder()
 * .name("name")
 * .sheetId("sheetId")
 * .build()))
 * .sourceEntityArn("sourceEntityArn")
 * .status("status")
 * .themeArn("themeArn")
 * .versionNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-dashboardversion.html)
 */
@CdkDslMarker
public class CfnDashboardDashboardVersionPropertyDsl {
    private val cdkBuilder: CfnDashboard.DashboardVersionProperty.Builder =
        CfnDashboard.DashboardVersionProperty.builder()

    private val _dataSetArns: MutableList<String> = mutableListOf()

    private val _errors: MutableList<Any> = mutableListOf()

    private val _sheets: MutableList<Any> = mutableListOf()

    /** @param arn The Amazon Resource Name (ARN) of the resource. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /** @param createdTime The time that this dashboard version was created. */
    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    /**
     * @param dataSetArns The Amazon Resource Numbers (ARNs) for the datasets that are associated
     *   with this version of the dashboard.
     */
    public fun dataSetArns(vararg dataSetArns: String) {
        _dataSetArns.addAll(listOf(*dataSetArns))
    }

    /**
     * @param dataSetArns The Amazon Resource Numbers (ARNs) for the datasets that are associated
     *   with this version of the dashboard.
     */
    public fun dataSetArns(dataSetArns: Collection<String>) {
        _dataSetArns.addAll(dataSetArns)
    }

    /** @param description Description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param errors Errors associated with this dashboard version. */
    public fun errors(vararg errors: Any) {
        _errors.addAll(listOf(*errors))
    }

    /** @param errors Errors associated with this dashboard version. */
    public fun errors(errors: Collection<Any>) {
        _errors.addAll(errors)
    }

    /** @param errors Errors associated with this dashboard version. */
    public fun errors(errors: IResolvable) {
        cdkBuilder.errors(errors)
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     *   sheet.
     */
    public fun sheets(vararg sheets: Any) {
        _sheets.addAll(listOf(*sheets))
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     *   sheet.
     */
    public fun sheets(sheets: Collection<Any>) {
        _sheets.addAll(sheets)
    }

    /**
     * @param sheets A list of the associated sheets with the unique identifier and name of each
     *   sheet.
     */
    public fun sheets(sheets: IResolvable) {
        cdkBuilder.sheets(sheets)
    }

    /** @param sourceEntityArn Source entity ARN. */
    public fun sourceEntityArn(sourceEntityArn: String) {
        cdkBuilder.sourceEntityArn(sourceEntityArn)
    }

    /** @param status The HTTP status of the request. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param themeArn The ARN of the theme associated with a version of the dashboard. */
    public fun themeArn(themeArn: String) {
        cdkBuilder.themeArn(themeArn)
    }

    /** @param versionNumber Version number for this version of the dashboard. */
    public fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): CfnDashboard.DashboardVersionProperty {
        if (_dataSetArns.isNotEmpty()) cdkBuilder.dataSetArns(_dataSetArns)
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        if (_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
        return cdkBuilder.build()
    }
}
