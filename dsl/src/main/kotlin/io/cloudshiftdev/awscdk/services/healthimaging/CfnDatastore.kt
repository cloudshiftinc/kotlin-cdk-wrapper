package io.cloudshiftdev.awscdk.services.healthimaging

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatastore internal constructor(
  private val cdkObject: software.amazon.awscdk.services.healthimaging.CfnDatastore,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDatastoreArn(): String = unwrap(this).getAttrDatastoreArn()

  public open fun attrDatastoreId(): String = unwrap(this).getAttrDatastoreId()

  public open fun attrDatastoreStatus(): String = unwrap(this).getAttrDatastoreStatus()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun datastoreName(): String? = unwrap(this).getDatastoreName()

  public open fun datastoreName(`value`: String) {
    unwrap(this).setDatastoreName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  public interface Builder {
    public fun datastoreName(datastoreName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthimaging.CfnDatastore.Builder =
        software.amazon.awscdk.services.healthimaging.CfnDatastore.Builder.create(scope, id)

    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

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
