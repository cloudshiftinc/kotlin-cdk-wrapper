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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisSectionBasedLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SectionBasedLayoutConfigurationProperty.Builder =
        CfnAnalysis.SectionBasedLayoutConfigurationProperty.builder()

    private val _bodySections: MutableList<Any> = mutableListOf()

    private val _footerSections: MutableList<Any> = mutableListOf()

    private val _headerSections: MutableList<Any> = mutableListOf()

    public fun bodySections(vararg bodySections: Any) {
        _bodySections.addAll(listOf(*bodySections))
    }

    public fun bodySections(bodySections: Collection<Any>) {
        _bodySections.addAll(bodySections)
    }

    public fun bodySections(bodySections: IResolvable) {
        cdkBuilder.bodySections(bodySections)
    }

    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun canvasSizeOptions(canvasSizeOptions: CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun footerSections(vararg footerSections: Any) {
        _footerSections.addAll(listOf(*footerSections))
    }

    public fun footerSections(footerSections: Collection<Any>) {
        _footerSections.addAll(footerSections)
    }

    public fun footerSections(footerSections: IResolvable) {
        cdkBuilder.footerSections(footerSections)
    }

    public fun headerSections(vararg headerSections: Any) {
        _headerSections.addAll(listOf(*headerSections))
    }

    public fun headerSections(headerSections: Collection<Any>) {
        _headerSections.addAll(headerSections)
    }

    public fun headerSections(headerSections: IResolvable) {
        cdkBuilder.headerSections(headerSections)
    }

    public fun build(): CfnAnalysis.SectionBasedLayoutConfigurationProperty {
        if (_bodySections.isNotEmpty()) cdkBuilder.bodySections(_bodySections)
        if (_footerSections.isNotEmpty()) cdkBuilder.footerSections(_footerSections)
        if (_headerSections.isNotEmpty()) cdkBuilder.headerSections(_headerSections)
        return cdkBuilder.build()
    }
}
