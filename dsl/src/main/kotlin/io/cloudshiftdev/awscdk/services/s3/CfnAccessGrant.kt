package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnAccessGrant internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun accessGrantsLocationConfiguration(): Any? =
      unwrap(this).getAccessGrantsLocationConfiguration()

  public open fun accessGrantsLocationConfiguration(`value`: IResolvable) {
    unwrap(this).setAccessGrantsLocationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun accessGrantsLocationConfiguration(`value`: AccessGrantsLocationConfigurationProperty) {
    unwrap(this).setAccessGrantsLocationConfiguration(`value`.let(AccessGrantsLocationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c091d6de2b049f07c257e4fd53a81435cdd1aeafe7f32b12f69baed17905e213")
  public open
      fun accessGrantsLocationConfiguration(`value`: AccessGrantsLocationConfigurationProperty.Builder.() -> Unit):
      Unit = accessGrantsLocationConfiguration(AccessGrantsLocationConfigurationProperty(`value`))

  public open fun accessGrantsLocationId(): String = unwrap(this).getAccessGrantsLocationId()

  public open fun accessGrantsLocationId(`value`: String) {
    unwrap(this).setAccessGrantsLocationId(`value`)
  }

  public open fun applicationArn(): String? = unwrap(this).getApplicationArn()

  public open fun applicationArn(`value`: String) {
    unwrap(this).setApplicationArn(`value`)
  }

  public open fun attrAccessGrantArn(): String = unwrap(this).getAttrAccessGrantArn()

  public open fun attrAccessGrantId(): String = unwrap(this).getAttrAccessGrantId()

  public open fun attrGrantScope(): String = unwrap(this).getAttrGrantScope()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun grantee(): Any = unwrap(this).getGrantee()

  public open fun grantee(`value`: IResolvable) {
    unwrap(this).setGrantee(`value`.let(IResolvable::unwrap))
  }

  public open fun grantee(`value`: GranteeProperty) {
    unwrap(this).setGrantee(`value`.let(GranteeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("425aceb1730d0497d1b959aa9786cc3fd53795310d391c9da13496723e3c12ff")
  public open fun grantee(`value`: GranteeProperty.Builder.() -> Unit): Unit =
      grantee(GranteeProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun permission(): String = unwrap(this).getPermission()

  public open fun permission(`value`: String) {
    unwrap(this).setPermission(`value`)
  }

  public open fun s3PrefixType(): String? = unwrap(this).getS3PrefixType()

  public open fun s3PrefixType(`value`: String) {
    unwrap(this).setS3PrefixType(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable) {
    }

    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d72d55b8d1a00d3acf0a7ff1012e5b0c3f5aab5487ac42f3f1075d4e2d68f8b")
    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty.Builder.() -> Unit) {
    }

    public fun accessGrantsLocationId(accessGrantsLocationId: String) {
    }

    public fun applicationArn(applicationArn: String) {
    }

    public fun grantee(grantee: IResolvable) {
    }

    public fun grantee(grantee: GranteeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb1414c75d8990c1a763de672fb6d01d405b4007e03ba307ff359247434b375")
    public fun grantee(grantee: GranteeProperty.Builder.() -> Unit) {
    }

    public fun permission(permission: String) {
    }

    public fun s3PrefixType(s3PrefixType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrant.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrant.Builder.create(scope, id)

    public override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(AccessGrantsLocationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d72d55b8d1a00d3acf0a7ff1012e5b0c3f5aab5487ac42f3f1075d4e2d68f8b")
    public override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: AccessGrantsLocationConfigurationProperty.Builder.() -> Unit):
        Unit =
        accessGrantsLocationConfiguration(AccessGrantsLocationConfigurationProperty(accessGrantsLocationConfiguration))

    public override fun accessGrantsLocationId(accessGrantsLocationId: String) {
      cdkBuilder.accessGrantsLocationId(accessGrantsLocationId)
    }

    public override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    public override fun grantee(grantee: IResolvable) {
      cdkBuilder.grantee(grantee.let(IResolvable::unwrap))
    }

    public override fun grantee(grantee: GranteeProperty) {
      cdkBuilder.grantee(grantee.let(GranteeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cb1414c75d8990c1a763de672fb6d01d405b4007e03ba307ff359247434b375")
    public override fun grantee(grantee: GranteeProperty.Builder.() -> Unit): Unit =
        grantee(GranteeProperty(grantee))

    public override fun permission(permission: String) {
      cdkBuilder.permission(permission)
    }

    public override fun s3PrefixType(s3PrefixType: String) {
      cdkBuilder.s3PrefixType(s3PrefixType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrant = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessGrant {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessGrant(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant): CfnAccessGrant
        = CfnAccessGrant(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrant): software.amazon.awscdk.services.s3.CfnAccessGrant
        = wrapped.cdkObject
  }

  public interface AccessGrantsLocationConfigurationProperty {
    public fun s3SubPrefix(): String

    public interface Builder {
      public fun s3SubPrefix(s3SubPrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty.builder()

      public override fun s3SubPrefix(s3SubPrefix: String) {
        cdkBuilder.s3SubPrefix(s3SubPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty,
    ) : AccessGrantsLocationConfigurationProperty {
      public override fun s3SubPrefix(): String = unwrap(this).getS3SubPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessGrantsLocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty):
          AccessGrantsLocationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessGrantsLocationConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnAccessGrant.AccessGrantsLocationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GranteeProperty {
    public fun granteeIdentifier(): String

    public fun granteeType(): String

    public interface Builder {
      public fun granteeIdentifier(granteeIdentifier: String) {
      }

      public fun granteeType(granteeType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty.builder()

      public override fun granteeIdentifier(granteeIdentifier: String) {
        cdkBuilder.granteeIdentifier(granteeIdentifier)
      }

      public override fun granteeType(granteeType: String) {
        cdkBuilder.granteeType(granteeType)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty,
    ) : GranteeProperty {
      public override fun granteeIdentifier(): String = unwrap(this).getGranteeIdentifier()

      public override fun granteeType(): String = unwrap(this).getGranteeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GranteeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty):
          GranteeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GranteeProperty):
          software.amazon.awscdk.services.s3.CfnAccessGrant.GranteeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
