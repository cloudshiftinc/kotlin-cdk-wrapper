@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnResourceProps {
  public fun hybridAccessEnabled(): Any? = unwrap(this).getHybridAccessEnabled()

  public fun resourceArn(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun useServiceLinkedRole(): Any

  public fun withFederation(): Any? = unwrap(this).getWithFederation()

  @CdkDslMarker
  public interface Builder {
    public fun hybridAccessEnabled(hybridAccessEnabled: Boolean)

    public fun hybridAccessEnabled(hybridAccessEnabled: IResolvable)

    public fun resourceArn(resourceArn: String)

    public fun roleArn(roleArn: String)

    public fun useServiceLinkedRole(useServiceLinkedRole: Boolean)

    public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable)

    public fun withFederation(withFederation: Boolean)

    public fun withFederation(withFederation: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnResourceProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnResourceProps.builder()

    override fun hybridAccessEnabled(hybridAccessEnabled: Boolean) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled)
    }

    override fun hybridAccessEnabled(hybridAccessEnabled: IResolvable) {
      cdkBuilder.hybridAccessEnabled(hybridAccessEnabled.let(IResolvable::unwrap))
    }

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    override fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
      cdkBuilder.useServiceLinkedRole(useServiceLinkedRole.let(IResolvable::unwrap))
    }

    override fun withFederation(withFederation: Boolean) {
      cdkBuilder.withFederation(withFederation)
    }

    override fun withFederation(withFederation: IResolvable) {
      cdkBuilder.withFederation(withFederation.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnResourceProps,
  ) : CdkObject(cdkObject), CfnResourceProps {
    override fun hybridAccessEnabled(): Any? = unwrap(this).getHybridAccessEnabled()

    override fun resourceArn(): String = unwrap(this).getResourceArn()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun useServiceLinkedRole(): Any = unwrap(this).getUseServiceLinkedRole()

    override fun withFederation(): Any? = unwrap(this).getWithFederation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnResourceProps):
        CfnResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceProps):
        software.amazon.awscdk.services.lakeformation.CfnResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lakeformation.CfnResourceProps
  }
}
