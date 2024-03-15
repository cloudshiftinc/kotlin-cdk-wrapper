@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccessPolicyProps {
  public fun accessPolicyIdentity(): Any

  public fun accessPolicyPermission(): String

  public fun accessPolicyResource(): Any

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable)

    public
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c12763fe8e7f55a71e475733f0777036ff85801c861048494babe29ab313c68")
    public
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty.Builder.() -> Unit)

    public fun accessPolicyPermission(accessPolicyPermission: String)

    public fun accessPolicyResource(accessPolicyResource: IResolvable)

    public
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("762a524aae62e4f6cffa176e4e0a0d8a73227d90f2e29d5420ab4c96bc95d1a8")
    public
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps.Builder
        = software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps.builder()

    override fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(IResolvable::unwrap))
    }

    override
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(CfnAccessPolicy.AccessPolicyIdentityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c12763fe8e7f55a71e475733f0777036ff85801c861048494babe29ab313c68")
    override
        fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty.Builder.() -> Unit):
        Unit =
        accessPolicyIdentity(CfnAccessPolicy.AccessPolicyIdentityProperty(accessPolicyIdentity))

    override fun accessPolicyPermission(accessPolicyPermission: String) {
      cdkBuilder.accessPolicyPermission(accessPolicyPermission)
    }

    override fun accessPolicyResource(accessPolicyResource: IResolvable) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(IResolvable::unwrap))
    }

    override
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(CfnAccessPolicy.AccessPolicyResourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("762a524aae62e4f6cffa176e4e0a0d8a73227d90f2e29d5420ab4c96bc95d1a8")
    override
        fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty.Builder.() -> Unit):
        Unit =
        accessPolicyResource(CfnAccessPolicy.AccessPolicyResourceProperty(accessPolicyResource))

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps,
  ) : CdkObject(cdkObject), CfnAccessPolicyProps {
    override fun accessPolicyIdentity(): Any = unwrap(this).getAccessPolicyIdentity()

    override fun accessPolicyPermission(): String = unwrap(this).getAccessPolicyPermission()

    override fun accessPolicyResource(): Any = unwrap(this).getAccessPolicyResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps):
        CfnAccessPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPolicyProps):
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps
  }
}
