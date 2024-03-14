package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApp internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appName(): String = unwrap(this).getAppName()

  public open fun appName(`value`: String) {
    unwrap(this).setAppName(`value`)
  }

  public open fun appType(): String = unwrap(this).getAppType()

  public open fun appType(`value`: String) {
    unwrap(this).setAppType(`value`)
  }

  public open fun attrAppArn(): String = unwrap(this).getAttrAppArn()

  public open fun domainId(): String = unwrap(this).getDomainId()

  public open fun domainId(`value`: String) {
    unwrap(this).setDomainId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceSpec(): Any? = unwrap(this).getResourceSpec()

  public open fun resourceSpec(`value`: IResolvable) {
    unwrap(this).setResourceSpec(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceSpec(`value`: ResourceSpecProperty) {
    unwrap(this).setResourceSpec(`value`.let(ResourceSpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd3f84f609c93f64bc688d5d5769c61da6d219d0d770f5ebaea1efb0bec2b395")
  public open fun resourceSpec(`value`: ResourceSpecProperty.Builder.() -> Unit): Unit =
      resourceSpec(ResourceSpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userProfileName(): String = unwrap(this).getUserProfileName()

  public open fun userProfileName(`value`: String) {
    unwrap(this).setUserProfileName(`value`)
  }

  public interface Builder {
    public fun appName(appName: String)

    public fun appType(appType: String)

    public fun domainId(domainId: String)

    public fun resourceSpec(resourceSpec: IResolvable)

    public fun resourceSpec(resourceSpec: ResourceSpecProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a18d0d61a4fd4339ee80ec6475c78192cc13cedd2ffb51653e34e42b651554")
    public fun resourceSpec(resourceSpec: ResourceSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userProfileName(userProfileName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnApp.Builder =
        software.amazon.awscdk.services.sagemaker.CfnApp.Builder.create(scope, id)

    override fun appName(appName: String) {
      cdkBuilder.appName(appName)
    }

    override fun appType(appType: String) {
      cdkBuilder.appType(appType)
    }

    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    override fun resourceSpec(resourceSpec: IResolvable) {
      cdkBuilder.resourceSpec(resourceSpec.let(IResolvable::unwrap))
    }

    override fun resourceSpec(resourceSpec: ResourceSpecProperty) {
      cdkBuilder.resourceSpec(resourceSpec.let(ResourceSpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a18d0d61a4fd4339ee80ec6475c78192cc13cedd2ffb51653e34e42b651554")
    override fun resourceSpec(resourceSpec: ResourceSpecProperty.Builder.() -> Unit): Unit =
        resourceSpec(ResourceSpecProperty(resourceSpec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnApp = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp): CfnApp =
        CfnApp(cdkObject)

    internal fun unwrap(wrapped: CfnApp): software.amazon.awscdk.services.sagemaker.CfnApp =
        wrapped.cdkObject
  }

  public interface ResourceSpecProperty {
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

    public fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()

    public interface Builder {
      public fun instanceType(instanceType: String)

      public fun sageMakerImageArn(sageMakerImageArn: String)

      public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty.builder()

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty,
    ) : ResourceSpecProperty {
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

      override fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty):
          ResourceSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
