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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCodeRepositoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCodeRepository.Builder = CfnCodeRepository.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun codeRepositoryName(codeRepositoryName: String) {
        cdkBuilder.codeRepositoryName(codeRepositoryName)
    }

    public fun gitConfig(gitConfig: IResolvable) {
        cdkBuilder.gitConfig(gitConfig)
    }

    public fun gitConfig(gitConfig: CfnCodeRepository.GitConfigProperty) {
        cdkBuilder.gitConfig(gitConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCodeRepository {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
