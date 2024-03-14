package io.cloudshiftdev.awscdk.services.healthimaging

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatastore internal constructor(
  private val cdkObject: software.amazon.awscdk.services.healthimaging.CfnDatastore,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The timestamp when the data store was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) for the data store.
   */
  public open fun attrDatastoreArn(): String = unwrap(this).getAttrDatastoreArn()

  /**
   * The data store identifier.
   */
  public open fun attrDatastoreId(): String = unwrap(this).getAttrDatastoreId()

  /**
   * The data store status.
   */
  public open fun attrDatastoreStatus(): String = unwrap(this).getAttrDatastoreStatus()

  /**
   * The timestamp when the data store was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The data store name.
   */
  public open fun datastoreName(): String? = unwrap(this).getDatastoreName()

  /**
   * The data store name.
   */
  public open fun datastoreName(`value`: String) {
    unwrap(this).setDatastoreName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS) key for accessing
   * encrypted data.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS) key for accessing
   * encrypted data.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The tags provided when creating a data store.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The tags provided when creating a data store.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.healthimaging.CfnDatastore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The data store name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-datastorename)
     * @param datastoreName The data store name. 
     */
    public fun datastoreName(datastoreName: String)

    /**
     * The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS) key for accessing
     * encrypted data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS)
     * key for accessing encrypted data. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The tags provided when creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-tags)
     * @param tags The tags provided when creating a data store. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthimaging.CfnDatastore.Builder =
        software.amazon.awscdk.services.healthimaging.CfnDatastore.Builder.create(scope, id)

    /**
     * The data store name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-datastorename)
     * @param datastoreName The data store name. 
     */
    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS) key for accessing
     * encrypted data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) assigned to the Key Management Service (KMS)
     * key for accessing encrypted data. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The tags provided when creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthimaging-datastore.html#cfn-healthimaging-datastore-tags)
     * @param tags The tags provided when creating a data store. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.healthimaging.CfnDatastore =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatastore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatastore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.healthimaging.CfnDatastore):
        CfnDatastore = CfnDatastore(cdkObject)

    internal fun unwrap(wrapped: CfnDatastore):
        software.amazon.awscdk.services.healthimaging.CfnDatastore = wrapped.cdkObject
  }
}
