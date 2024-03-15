@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.healthimaging

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnDatastore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.healthimaging.*;
 * CfnDatastoreProps cfnDatastoreProps = CfnDatastoreProps.builder()
 * .datastoreName("datastoreName")
 * .kmsKeyArn("kmsKeyArn")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html)
 */
public interface CfnDatastoreProps {
  /**
   * The data store name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-datastorename)
   */
  public fun datastoreName(): String? = unwrap(this).getDatastoreName()

  /**
   * The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS) key for accessing
   * encrypted data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The tags provided when creating a data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnDatastoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datastoreName The data store name.
     */
    public fun datastoreName(datastoreName: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS)
     * key for accessing encrypted data.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param tags The tags provided when creating a data store.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthimaging.CfnDatastoreProps.Builder
        = software.amazon.awscdk.services.healthimaging.CfnDatastoreProps.builder()

    /**
     * @param datastoreName The data store name.
     */
    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS)
     * key for accessing encrypted data.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param tags The tags provided when creating a data store.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.healthimaging.CfnDatastoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.healthimaging.CfnDatastoreProps,
  ) : CdkObject(cdkObject), CfnDatastoreProps {
    /**
     * The data store name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-datastorename)
     */
    override fun datastoreName(): String? = unwrap(this).getDatastoreName()

    /**
     * The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS) key for accessing
     * encrypted data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The tags provided when creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatastoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.healthimaging.CfnDatastoreProps):
        CfnDatastoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatastoreProps):
        software.amazon.awscdk.services.healthimaging.CfnDatastoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.healthimaging.CfnDatastoreProps
  }
}
