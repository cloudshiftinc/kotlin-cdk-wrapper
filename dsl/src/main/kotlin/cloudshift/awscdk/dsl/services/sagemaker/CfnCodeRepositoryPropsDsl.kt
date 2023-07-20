@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps

@CdkDslMarker
public class CfnCodeRepositoryPropsDsl {
  private val cdkBuilder: CfnCodeRepositoryProps.Builder = CfnCodeRepositoryProps.builder()

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

  public fun build(): CfnCodeRepositoryProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
