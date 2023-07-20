@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceConfluenceAttachmentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluenceAttachmentConfigurationProperty.Builder =
      CfnDataSource.ConfluenceAttachmentConfigurationProperty.builder()

  private val _attachmentFieldMappings: MutableList<Any> = mutableListOf()

  public fun attachmentFieldMappings(vararg attachmentFieldMappings: Any) {
    _attachmentFieldMappings.addAll(listOf(*attachmentFieldMappings))
  }

  public fun attachmentFieldMappings(attachmentFieldMappings: Collection<Any>) {
    _attachmentFieldMappings.addAll(attachmentFieldMappings)
  }

  public fun attachmentFieldMappings(attachmentFieldMappings: IResolvable) {
    cdkBuilder.attachmentFieldMappings(attachmentFieldMappings)
  }

  public fun crawlAttachments(crawlAttachments: Boolean) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  public fun crawlAttachments(crawlAttachments: IResolvable) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  public fun build(): CfnDataSource.ConfluenceAttachmentConfigurationProperty {
    if(_attachmentFieldMappings.isNotEmpty())
        cdkBuilder.attachmentFieldMappings(_attachmentFieldMappings)
    return cdkBuilder.build()
  }
}
