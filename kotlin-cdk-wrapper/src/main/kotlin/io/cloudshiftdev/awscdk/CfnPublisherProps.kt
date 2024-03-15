@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnPublisherProps {
  public fun acceptTermsAndConditions(): Any

  public fun connectionArn(): String? = unwrap(this).getConnectionArn()

  @CdkDslMarker
  public interface Builder {
    public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean)

    public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable)

    public fun connectionArn(connectionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnPublisherProps.Builder =
        software.amazon.awscdk.CfnPublisherProps.builder()

    override fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    override fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions.let(IResolvable::unwrap))
    }

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    public fun build(): software.amazon.awscdk.CfnPublisherProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnPublisherProps,
  ) : CdkObject(cdkObject), CfnPublisherProps {
    override fun acceptTermsAndConditions(): Any = unwrap(this).getAcceptTermsAndConditions()

    override fun connectionArn(): String? = unwrap(this).getConnectionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublisherProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnPublisherProps): CfnPublisherProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublisherProps): software.amazon.awscdk.CfnPublisherProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnPublisherProps
  }
}
