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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRepositoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRepository.Builder = CfnRepository.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _triggers: MutableList<Any> = mutableListOf()

    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    public fun code(code: CfnRepository.CodeProperty) {
        cdkBuilder.code(code)
    }

    public fun repositoryDescription(repositoryDescription: String) {
        cdkBuilder.repositoryDescription(repositoryDescription)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun triggers(vararg triggers: Any) {
        _triggers.addAll(listOf(*triggers))
    }

    public fun triggers(triggers: Collection<Any>) {
        _triggers.addAll(triggers)
    }

    public fun triggers(triggers: IResolvable) {
        cdkBuilder.triggers(triggers)
    }

    public fun build(): CfnRepository {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_triggers.isNotEmpty()) cdkBuilder.triggers(_triggers)
        return cdkBuilder.build()
    }
}
