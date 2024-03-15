@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceProps {
  public fun applicationIdentifier(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun endpointType(): String

  public fun environmentIdentifier(): String

  public fun lambdaEndpoint(): Any? = unwrap(this).getLambdaEndpoint()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun urlEndpoint(): Any? = unwrap(this).getUrlEndpoint()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun applicationIdentifier(applicationIdentifier: String)

    public fun description(description: String)

    public fun endpointType(endpointType: String)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun lambdaEndpoint(lambdaEndpoint: IResolvable)

    public fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e55d27e38cead429a8d66fd2bd96794e6bcb3a239892e69d6c69110b0eefdb0b")
    public
        fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun urlEndpoint(urlEndpoint: IResolvable)

    public fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17159304b0dec4c0b9633e5b97fb406060fcfea30e889bdb20021a6a468834b7")
    public fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty.Builder.() -> Unit)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnServiceProps.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnServiceProps.builder()

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

    override fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty) {
      cdkBuilder.lambdaEndpoint(lambdaEndpoint.let(CfnService.LambdaEndpointInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e55d27e38cead429a8d66fd2bd96794e6bcb3a239892e69d6c69110b0eefdb0b")
    override
        fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty.Builder.() -> Unit):
        Unit = lambdaEndpoint(CfnService.LambdaEndpointInputProperty(lambdaEndpoint))

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

    override fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty) {
      cdkBuilder.urlEndpoint(urlEndpoint.let(CfnService.UrlEndpointInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17159304b0dec4c0b9633e5b97fb406060fcfea30e889bdb20021a6a468834b7")
    override fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty.Builder.() -> Unit):
        Unit = urlEndpoint(CfnService.UrlEndpointInputProperty(urlEndpoint))

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    override fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

    override fun description(): String? = unwrap(this).getDescription()

    override fun endpointType(): String = unwrap(this).getEndpointType()

    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    override fun lambdaEndpoint(): Any? = unwrap(this).getLambdaEndpoint()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun urlEndpoint(): Any? = unwrap(this).getUrlEndpoint()

    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.refactorspaces.CfnServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.refactorspaces.CfnServiceProps
  }
}
