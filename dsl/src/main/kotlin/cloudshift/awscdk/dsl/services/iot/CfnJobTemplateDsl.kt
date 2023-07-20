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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnJobTemplate.Builder = CfnJobTemplate.Builder.create(scope, id)

    private val _maintenanceWindows: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun abortConfig(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.abortConfig(builder.map)
    }

    public fun abortConfig(abortConfig: Any) {
        cdkBuilder.abortConfig(abortConfig)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun document(document: String) {
        cdkBuilder.document(document)
    }

    public fun documentSource(documentSource: String) {
        cdkBuilder.documentSource(documentSource)
    }

    public fun jobArn(jobArn: String) {
        cdkBuilder.jobArn(jobArn)
    }

    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable) {
        cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig)
    }

    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty) {
        cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig)
    }

    public fun jobExecutionsRolloutConfig(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.jobExecutionsRolloutConfig(builder.map)
    }

    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    public fun jobTemplateId(jobTemplateId: String) {
        cdkBuilder.jobTemplateId(jobTemplateId)
    }

    public fun maintenanceWindows(vararg maintenanceWindows: Any) {
        _maintenanceWindows.addAll(listOf(*maintenanceWindows))
    }

    public fun maintenanceWindows(maintenanceWindows: Collection<Any>) {
        _maintenanceWindows.addAll(maintenanceWindows)
    }

    public fun maintenanceWindows(maintenanceWindows: IResolvable) {
        cdkBuilder.maintenanceWindows(maintenanceWindows)
    }

    public fun presignedUrlConfig(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.presignedUrlConfig(builder.map)
    }

    public fun presignedUrlConfig(presignedUrlConfig: Any) {
        cdkBuilder.presignedUrlConfig(presignedUrlConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun timeoutConfig(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.timeoutConfig(builder.map)
    }

    public fun timeoutConfig(timeoutConfig: Any) {
        cdkBuilder.timeoutConfig(timeoutConfig)
    }

    public fun build(): CfnJobTemplate {
        if (_maintenanceWindows.isNotEmpty()) cdkBuilder.maintenanceWindows(_maintenanceWindows)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
