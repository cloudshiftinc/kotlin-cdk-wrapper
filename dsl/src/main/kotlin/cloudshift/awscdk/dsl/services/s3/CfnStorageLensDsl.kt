@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.constructs.Construct

@CdkDslMarker
public class CfnStorageLensDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStorageLens.Builder = CfnStorageLens.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * This resource contains the details Amazon S3 Storage Lens configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
   * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
   * configuration. 
   */
  public fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
    cdkBuilder.storageLensConfiguration(storageLensConfiguration)
  }

  /**
   * This resource contains the details Amazon S3 Storage Lens configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
   * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
   * configuration. 
   */
  public
      fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty) {
    cdkBuilder.storageLensConfiguration(storageLensConfiguration)
  }

  /**
   * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
   * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
   * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStorageLens {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
