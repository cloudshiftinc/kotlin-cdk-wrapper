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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnProject
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnProjectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun appConfigResource(appConfigResource: IResolvable) {
        cdkBuilder.appConfigResource(appConfigResource)
    }

    public fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty) {
        cdkBuilder.appConfigResource(appConfigResource)
    }

    public fun dataDelivery(dataDelivery: IResolvable) {
        cdkBuilder.dataDelivery(dataDelivery)
    }

    public fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty) {
        cdkBuilder.dataDelivery(dataDelivery)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProject {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
