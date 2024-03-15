@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.alexa.ask

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSkill internal constructor(
  internal override val cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun authenticationConfiguration(): Any = unwrap(this).getAuthenticationConfiguration()

  public open fun authenticationConfiguration(`value`: IResolvable) {
    unwrap(this).setAuthenticationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun authenticationConfiguration(`value`: AuthenticationConfigurationProperty) {
    unwrap(this).setAuthenticationConfiguration(`value`.let(AuthenticationConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88004043ed86646dc18b8e3a53b1ae882edfeac1a686f59f6653eac81dd7ff26")
  public open
      fun authenticationConfiguration(`value`: AuthenticationConfigurationProperty.Builder.() -> Unit):
      Unit = authenticationConfiguration(AuthenticationConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun skillPackage(): Any = unwrap(this).getSkillPackage()

  public open fun skillPackage(`value`: IResolvable) {
    unwrap(this).setSkillPackage(`value`.let(IResolvable::unwrap))
  }

  public open fun skillPackage(`value`: SkillPackageProperty) {
    unwrap(this).setSkillPackage(`value`.let(SkillPackageProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c93828306ad2c9b3d8c39bf3596a81dcaa729ec089ffad6363a76ed2b2c37ddf")
  public open fun skillPackage(`value`: SkillPackageProperty.Builder.() -> Unit): Unit =
      skillPackage(SkillPackageProperty(`value`))

  public open fun vendorId(): String = unwrap(this).getVendorId()

  public open fun vendorId(`value`: String) {
    unwrap(this).setVendorId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

    public
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37fcab36fae7d2b86f1f3810bf7474706e1cfd136bb24323f15e8c78bd597311")
    public
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit)

    public fun skillPackage(skillPackage: IResolvable)

    public fun skillPackage(skillPackage: SkillPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27243d70f0bca05762c9ee33da5908e19d239fc2644517eff6d81ae2bca2f3e5")
    public fun skillPackage(skillPackage: SkillPackageProperty.Builder.() -> Unit)

    public fun vendorId(vendorId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkill.Builder =
        software.amazon.awscdk.alexa.ask.CfnSkill.Builder.create(scope, id)

    override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37fcab36fae7d2b86f1f3810bf7474706e1cfd136bb24323f15e8c78bd597311")
    override
        fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationProperty.Builder.() -> Unit):
        Unit =
        authenticationConfiguration(AuthenticationConfigurationProperty(authenticationConfiguration))

    override fun skillPackage(skillPackage: IResolvable) {
      cdkBuilder.skillPackage(skillPackage.let(IResolvable::unwrap))
    }

    override fun skillPackage(skillPackage: SkillPackageProperty) {
      cdkBuilder.skillPackage(skillPackage.let(SkillPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27243d70f0bca05762c9ee33da5908e19d239fc2644517eff6d81ae2bca2f3e5")
    override fun skillPackage(skillPackage: SkillPackageProperty.Builder.() -> Unit): Unit =
        skillPackage(SkillPackageProperty(skillPackage))

    override fun vendorId(vendorId: String) {
      cdkBuilder.vendorId(vendorId)
    }

    public fun build(): software.amazon.awscdk.alexa.ask.CfnSkill = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.alexa.ask.CfnSkill.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSkill {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSkill(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill): CfnSkill =
        CfnSkill(cdkObject)

    internal fun unwrap(wrapped: CfnSkill): software.amazon.awscdk.alexa.ask.CfnSkill =
        wrapped.cdkObject
  }

  public interface SkillPackageProperty {
    public fun overrides(): Any? = unwrap(this).getOverrides()

    public fun s3Bucket(): String

    public fun s3BucketRole(): String? = unwrap(this).getS3BucketRole()

    public fun s3Key(): String

    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    @CdkDslMarker
    public interface Builder {
      public fun overrides(overrides: IResolvable)

      public fun overrides(overrides: OverridesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d27def801a2afcb02efa20e1f4e48fe9a7fbf15c11da0ace5af7d3771bedbcc")
      public fun overrides(overrides: OverridesProperty.Builder.() -> Unit)

      public fun s3Bucket(s3Bucket: String)

      public fun s3BucketRole(s3BucketRole: String)

      public fun s3Key(s3Key: String)

      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder
          = software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.builder()

      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      override fun overrides(overrides: OverridesProperty) {
        cdkBuilder.overrides(overrides.let(OverridesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d27def801a2afcb02efa20e1f4e48fe9a7fbf15c11da0ace5af7d3771bedbcc")
      override fun overrides(overrides: OverridesProperty.Builder.() -> Unit): Unit =
          overrides(OverridesProperty(overrides))

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3BucketRole(s3BucketRole: String) {
        cdkBuilder.s3BucketRole(s3BucketRole)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build(): software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty,
    ) : CdkObject(cdkObject), SkillPackageProperty {
      override fun overrides(): Any? = unwrap(this).getOverrides()

      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3BucketRole(): String? = unwrap(this).getS3BucketRole()

      override fun s3Key(): String = unwrap(this).getS3Key()

      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SkillPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty):
          SkillPackageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkillPackageProperty):
          software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty
    }
  }

  public interface OverridesProperty {
    public fun manifest(): Any? = unwrap(this).getManifest()

    @CdkDslMarker
    public interface Builder {
      public fun manifest(manifest: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder =
          software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.builder()

      override fun manifest(manifest: Any) {
        cdkBuilder.manifest(manifest)
      }

      public fun build(): software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty,
    ) : CdkObject(cdkObject), OverridesProperty {
      override fun manifest(): Any? = unwrap(this).getManifest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty):
          OverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverridesProperty):
          software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty
    }
  }

  public interface AuthenticationConfigurationProperty {
    public fun clientId(): String

    public fun clientSecret(): String

    public fun refreshToken(): String

    @CdkDslMarker
    public interface Builder {
      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder =
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.builder()

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty,
    ) : CdkObject(cdkObject), AuthenticationConfigurationProperty {
      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String = unwrap(this).getClientSecret()

      override fun refreshToken(): String = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty):
          AuthenticationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationProperty):
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty
    }
  }
}
