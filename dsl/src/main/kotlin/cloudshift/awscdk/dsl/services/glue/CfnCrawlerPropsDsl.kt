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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnCrawlerProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCrawlerPropsDsl {
    private val cdkBuilder: CfnCrawlerProps.Builder = CfnCrawlerProps.builder()

    private val _classifiers: MutableList<String> = mutableListOf()

    public fun classifiers(vararg classifiers: String) {
        _classifiers.addAll(listOf(*classifiers))
    }

    public fun classifiers(classifiers: Collection<String>) {
        _classifiers.addAll(classifiers)
    }

    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    public fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String) {
        cdkBuilder.crawlerSecurityConfiguration(crawlerSecurityConfiguration)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun recrawlPolicy(recrawlPolicy: IResolvable) {
        cdkBuilder.recrawlPolicy(recrawlPolicy)
    }

    public fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty) {
        cdkBuilder.recrawlPolicy(recrawlPolicy)
    }

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    public fun schedule(schedule: CfnCrawler.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun schemaChangePolicy(schemaChangePolicy: IResolvable) {
        cdkBuilder.schemaChangePolicy(schemaChangePolicy)
    }

    public fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty) {
        cdkBuilder.schemaChangePolicy(schemaChangePolicy)
    }

    public fun tablePrefix(tablePrefix: String) {
        cdkBuilder.tablePrefix(tablePrefix)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun targets(targets: CfnCrawler.TargetsProperty) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnCrawlerProps {
        if (_classifiers.isNotEmpty()) cdkBuilder.classifiers(_classifiers)
        return cdkBuilder.build()
    }
}
