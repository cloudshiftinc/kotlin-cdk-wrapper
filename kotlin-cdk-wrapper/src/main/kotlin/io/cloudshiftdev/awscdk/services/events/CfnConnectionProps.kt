@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectionProps {
  public fun authParameters(): Any? = unwrap(this).getAuthParameters()

  public fun authorizationType(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun authParameters(authParameters: IResolvable)

    public fun authParameters(authParameters: CfnConnection.AuthParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf937ae1aa8f4c90c97e3448b625c5c03492ccadd908836c6f18632e7bbb3499")
    public
        fun authParameters(authParameters: CfnConnection.AuthParametersProperty.Builder.() -> Unit)

    public fun authorizationType(authorizationType: String)

    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.events.CfnConnectionProps.builder()

    override fun authParameters(authParameters: IResolvable) {
      cdkBuilder.authParameters(authParameters.let(IResolvable::unwrap))
    }

    override fun authParameters(authParameters: CfnConnection.AuthParametersProperty) {
      cdkBuilder.authParameters(authParameters.let(CfnConnection.AuthParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf937ae1aa8f4c90c97e3448b625c5c03492ccadd908836c6f18632e7bbb3499")
    override
        fun authParameters(authParameters: CfnConnection.AuthParametersProperty.Builder.() -> Unit):
        Unit = authParameters(CfnConnection.AuthParametersProperty(authParameters))

    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnConnectionProps,
  ) : CdkObject(cdkObject), CfnConnectionProps {
    override fun authParameters(): Any? = unwrap(this).getAuthParameters()

    override fun authorizationType(): String = unwrap(this).getAuthorizationType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnConnectionProps):
        CfnConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.events.CfnConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnConnectionProps
  }
}
