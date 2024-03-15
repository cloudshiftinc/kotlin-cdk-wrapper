@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.alexa.ask

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSkillProps {
  public fun authenticationConfiguration(): Any

  public fun skillPackage(): Any

  public fun vendorId(): String

  @CdkDslMarker
  public interface Builder {
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

    public
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9bb8ab40eb8ab6bb8edfdc2a715b761b8195775c10d064a1bdb07cabf1ec34")
    public
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty.Builder.() -> Unit)

    public fun skillPackage(skillPackage: IResolvable)

    public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c74f2bb7339be9d6c7dd6f6a2ba406cbe87985f1183cc662deee0e921b76f2c")
    public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty.Builder.() -> Unit)

    public fun vendorId(vendorId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder =
        software.amazon.awscdk.alexa.ask.CfnSkillProps.builder()

    override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(CfnSkill.AuthenticationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9bb8ab40eb8ab6bb8edfdc2a715b761b8195775c10d064a1bdb07cabf1ec34")
    override
        fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty.Builder.() -> Unit):
        Unit =
        authenticationConfiguration(CfnSkill.AuthenticationConfigurationProperty(authenticationConfiguration))

    override fun skillPackage(skillPackage: IResolvable) {
      cdkBuilder.skillPackage(skillPackage.let(IResolvable::unwrap))
    }

    override fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty) {
      cdkBuilder.skillPackage(skillPackage.let(CfnSkill.SkillPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c74f2bb7339be9d6c7dd6f6a2ba406cbe87985f1183cc662deee0e921b76f2c")
    override fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty.Builder.() -> Unit): Unit
        = skillPackage(CfnSkill.SkillPackageProperty(skillPackage))

    override fun vendorId(vendorId: String) {
      cdkBuilder.vendorId(vendorId)
    }

    public fun build(): software.amazon.awscdk.alexa.ask.CfnSkillProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.alexa.ask.CfnSkillProps,
  ) : CdkObject(cdkObject), CfnSkillProps {
    override fun authenticationConfiguration(): Any = unwrap(this).getAuthenticationConfiguration()

    override fun skillPackage(): Any = unwrap(this).getSkillPackage()

    override fun vendorId(): String = unwrap(this).getVendorId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSkillProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkillProps): CfnSkillProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSkillProps): software.amazon.awscdk.alexa.ask.CfnSkillProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.alexa.ask.CfnSkillProps
  }
}
