package io.cloudshiftdev.awscdk.services.refactorspaces

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

public open class CfnService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

  public open fun applicationIdentifier(`value`: String) {
    unwrap(this).setApplicationIdentifier(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrServiceIdentifier(): String = unwrap(this).getAttrServiceIdentifier()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun endpointType(): String = unwrap(this).getEndpointType()

  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lambdaEndpoint(): Any? = unwrap(this).getLambdaEndpoint()

  public open fun lambdaEndpoint(`value`: IResolvable) {
    unwrap(this).setLambdaEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun lambdaEndpoint(`value`: LambdaEndpointInputProperty) {
    unwrap(this).setLambdaEndpoint(`value`.let(LambdaEndpointInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6002f55ad476aecd6fbf6a29161c2db7c50739c600deef6daac469536ee641e")
  public open fun lambdaEndpoint(`value`: LambdaEndpointInputProperty.Builder.() -> Unit): Unit =
      lambdaEndpoint(LambdaEndpointInputProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun urlEndpoint(): Any? = unwrap(this).getUrlEndpoint()

  public open fun urlEndpoint(`value`: IResolvable) {
    unwrap(this).setUrlEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun urlEndpoint(`value`: UrlEndpointInputProperty) {
    unwrap(this).setUrlEndpoint(`value`.let(UrlEndpointInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("268c8a2cc69b43900571ec909406ae97c9c8eda0f39ecdcda8f7235d451c1f85")
  public open fun urlEndpoint(`value`: UrlEndpointInputProperty.Builder.() -> Unit): Unit =
      urlEndpoint(UrlEndpointInputProperty(`value`))

  public open fun vpcId(): String? = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun applicationIdentifier(applicationIdentifier: String)

    public fun description(description: String)

    public fun endpointType(endpointType: String)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun lambdaEndpoint(lambdaEndpoint: IResolvable)

    public fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6231c439ee4d9e501fb467b9f8e57e8b658fd232b6b74ea00bfbce15775d6ea")
    public fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun urlEndpoint(urlEndpoint: IResolvable)

    public fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("039f05d004b16fc1e37d9d89a671b729283050b461d9b1154fec48fd0ce04faa")
    public fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty.Builder.() -> Unit)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnService.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnService.Builder.create(scope, id)

    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    override fun lambdaEndpoint(lambdaEndpoint: IResolvable) {
      cdkBuilder.lambdaEndpoint(lambdaEndpoint.let(IResolvable::unwrap))
    }

    override fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty) {
      cdkBuilder.lambdaEndpoint(lambdaEndpoint.let(LambdaEndpointInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6231c439ee4d9e501fb467b9f8e57e8b658fd232b6b74ea00bfbce15775d6ea")
    override fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty.Builder.() -> Unit):
        Unit = lambdaEndpoint(LambdaEndpointInputProperty(lambdaEndpoint))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun urlEndpoint(urlEndpoint: IResolvable) {
      cdkBuilder.urlEndpoint(urlEndpoint.let(IResolvable::unwrap))
    }

    override fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty) {
      cdkBuilder.urlEndpoint(urlEndpoint.let(UrlEndpointInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("039f05d004b16fc1e37d9d89a671b729283050b461d9b1154fec48fd0ce04faa")
    override fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty.Builder.() -> Unit): Unit =
        urlEndpoint(UrlEndpointInputProperty(urlEndpoint))

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService):
        CfnService = CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService):
        software.amazon.awscdk.services.refactorspaces.CfnService = wrapped.cdkObject
  }

  public interface UrlEndpointInputProperty {
    public fun healthUrl(): String? = unwrap(this).getHealthUrl()

    public fun url(): String

    public interface Builder {
      public fun healthUrl(healthUrl: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty.builder()

      override fun healthUrl(healthUrl: String) {
        cdkBuilder.healthUrl(healthUrl)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty,
    ) : UrlEndpointInputProperty {
      override fun healthUrl(): String? = unwrap(this).getHealthUrl()

      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UrlEndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty):
          UrlEndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UrlEndpointInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaEndpointInputProperty {
    public fun arn(): String

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty,
    ) : LambdaEndpointInputProperty {
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaEndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty):
          LambdaEndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaEndpointInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
