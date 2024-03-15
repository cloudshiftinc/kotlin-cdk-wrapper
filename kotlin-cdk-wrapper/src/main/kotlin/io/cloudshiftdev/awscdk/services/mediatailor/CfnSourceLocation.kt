@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSourceLocation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun accessConfiguration(): Any? = unwrap(this).getAccessConfiguration()

  public open fun accessConfiguration(`value`: IResolvable) {
    unwrap(this).setAccessConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun accessConfiguration(`value`: AccessConfigurationProperty) {
    unwrap(this).setAccessConfiguration(`value`.let(AccessConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b77590368850047370ce0d6b74641c3c2ef23070a36a47cb813ce2f48ab30f79")
  public open fun accessConfiguration(`value`: AccessConfigurationProperty.Builder.() -> Unit): Unit
      = accessConfiguration(AccessConfigurationProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun defaultSegmentDeliveryConfiguration(): Any? =
      unwrap(this).getDefaultSegmentDeliveryConfiguration()

  public open fun defaultSegmentDeliveryConfiguration(`value`: IResolvable) {
    unwrap(this).setDefaultSegmentDeliveryConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun defaultSegmentDeliveryConfiguration(`value`: DefaultSegmentDeliveryConfigurationProperty) {
    unwrap(this).setDefaultSegmentDeliveryConfiguration(`value`.let(DefaultSegmentDeliveryConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("346c7fe35845444126117fe3f3bbeb954f86ea0d31398d0267ed8efc9baeb5b7")
  public open
      fun defaultSegmentDeliveryConfiguration(`value`: DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit):
      Unit =
      defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty(`value`))

  public open fun httpConfiguration(): Any = unwrap(this).getHttpConfiguration()

  public open fun httpConfiguration(`value`: IResolvable) {
    unwrap(this).setHttpConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun httpConfiguration(`value`: HttpConfigurationProperty) {
    unwrap(this).setHttpConfiguration(`value`.let(HttpConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e20c6f5c5c82b207ae5616d96f686e3a08218d9d773abdb3ec4741a36cc5eebf")
  public open fun httpConfiguration(`value`: HttpConfigurationProperty.Builder.() -> Unit): Unit =
      httpConfiguration(HttpConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun segmentDeliveryConfigurations(): Any? =
      unwrap(this).getSegmentDeliveryConfigurations()

  public open fun segmentDeliveryConfigurations(`value`: IResolvable) {
    unwrap(this).setSegmentDeliveryConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun segmentDeliveryConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setSegmentDeliveryConfigurations(__idx_ac66f0)
  }

  public open fun segmentDeliveryConfigurations(vararg __idx_ac66f0: Any): Unit =
      segmentDeliveryConfigurations(__idx_ac66f0.toList())

  public open fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

  public open fun sourceLocationName(`value`: String) {
    unwrap(this).setSourceLocationName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun accessConfiguration(accessConfiguration: IResolvable)

    public fun accessConfiguration(accessConfiguration: AccessConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a88d145bc10a5f5f2f903b775091902ea3ff0a961a7aeeb328bd12627aed70")
    public
        fun accessConfiguration(accessConfiguration: AccessConfigurationProperty.Builder.() -> Unit)

    public fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable)

    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b2bfcbc2ff29a32e75ed5a5d10e2ac67ca558e25a14e61ffbb2f99463b1ca7f")
    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit)

    public fun httpConfiguration(httpConfiguration: IResolvable)

    public fun httpConfiguration(httpConfiguration: HttpConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("411543ce488bbe8334be375cc6ac845d6e4a00b8a51c9bdfa215efd6da46bc51")
    public fun httpConfiguration(httpConfiguration: HttpConfigurationProperty.Builder.() -> Unit)

    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable)

    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>)

    public fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any)

    public fun sourceLocationName(sourceLocationName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.Builder =
        software.amazon.awscdk.services.mediatailor.CfnSourceLocation.Builder.create(scope, id)

    override fun accessConfiguration(accessConfiguration: IResolvable) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(IResolvable::unwrap))
    }

    override fun accessConfiguration(accessConfiguration: AccessConfigurationProperty) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(AccessConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a88d145bc10a5f5f2f903b775091902ea3ff0a961a7aeeb328bd12627aed70")
    override
        fun accessConfiguration(accessConfiguration: AccessConfigurationProperty.Builder.() -> Unit):
        Unit = accessConfiguration(AccessConfigurationProperty(accessConfiguration))

    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(IResolvable::unwrap))
    }

    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(DefaultSegmentDeliveryConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b2bfcbc2ff29a32e75ed5a5d10e2ac67ca558e25a14e61ffbb2f99463b1ca7f")
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty(defaultSegmentDeliveryConfiguration))

    override fun httpConfiguration(httpConfiguration: IResolvable) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(IResolvable::unwrap))
    }

    override fun httpConfiguration(httpConfiguration: HttpConfigurationProperty) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(HttpConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("411543ce488bbe8334be375cc6ac845d6e4a00b8a51c9bdfa215efd6da46bc51")
    override fun httpConfiguration(httpConfiguration: HttpConfigurationProperty.Builder.() -> Unit):
        Unit = httpConfiguration(HttpConfigurationProperty(httpConfiguration))

    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations.let(IResolvable::unwrap))
    }

    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations)
    }

    override fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any): Unit =
        segmentDeliveryConfigurations(segmentDeliveryConfigurations.toList())

    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnSourceLocation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediatailor.CfnSourceLocation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSourceLocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSourceLocation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation):
        CfnSourceLocation = CfnSourceLocation(cdkObject)

    internal fun unwrap(wrapped: CfnSourceLocation):
        software.amazon.awscdk.services.mediatailor.CfnSourceLocation = wrapped.cdkObject
  }

  public interface DefaultSegmentDeliveryConfigurationProperty {
    public fun baseUrl(): String? = unwrap(this).getBaseUrl()

    @CdkDslMarker
    public interface Builder {
      public fun baseUrl(baseUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.builder()

      override fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty,
    ) : CdkObject(cdkObject), DefaultSegmentDeliveryConfigurationProperty {
      override fun baseUrl(): String? = unwrap(this).getBaseUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultSegmentDeliveryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty):
          DefaultSegmentDeliveryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultSegmentDeliveryConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
    }
  }

  public interface SegmentDeliveryConfigurationProperty {
    public fun baseUrl(): String? = unwrap(this).getBaseUrl()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun baseUrl(baseUrl: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty.builder()

      override fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty,
    ) : CdkObject(cdkObject), SegmentDeliveryConfigurationProperty {
      override fun baseUrl(): String? = unwrap(this).getBaseUrl()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SegmentDeliveryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty):
          SegmentDeliveryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentDeliveryConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty
    }
  }

  public interface SecretsManagerAccessTokenConfigurationProperty {
    public fun headerName(): String? = unwrap(this).getHeaderName()

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    public fun secretStringKey(): String? = unwrap(this).getSecretStringKey()

    @CdkDslMarker
    public interface Builder {
      public fun headerName(headerName: String)

      public fun secretArn(secretArn: String)

      public fun secretStringKey(secretStringKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty.builder()

      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun secretStringKey(secretStringKey: String) {
        cdkBuilder.secretStringKey(secretStringKey)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty,
    ) : CdkObject(cdkObject), SecretsManagerAccessTokenConfigurationProperty {
      override fun headerName(): String? = unwrap(this).getHeaderName()

      override fun secretArn(): String? = unwrap(this).getSecretArn()

      override fun secretStringKey(): String? = unwrap(this).getSecretStringKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecretsManagerAccessTokenConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty):
          SecretsManagerAccessTokenConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretsManagerAccessTokenConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
    }
  }

  public interface HttpConfigurationProperty {
    public fun baseUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun baseUrl(baseUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty.builder()

      override fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty,
    ) : CdkObject(cdkObject), HttpConfigurationProperty {
      override fun baseUrl(): String = unwrap(this).getBaseUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty):
          HttpConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty
    }
  }

  public interface AccessConfigurationProperty {
    public fun accessType(): String? = unwrap(this).getAccessType()

    public fun secretsManagerAccessTokenConfiguration(): Any? =
        unwrap(this).getSecretsManagerAccessTokenConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun accessType(accessType: String)

      public
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: IResolvable)

      public
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1866a09a4118eb44d3a715ed2465a6ded5a1a5722f6b6958bdb47e09f0dfe2bf")
      public
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty.builder()

      override fun accessType(accessType: String) {
        cdkBuilder.accessType(accessType)
      }

      override
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: IResolvable) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration.let(IResolvable::unwrap))
      }

      override
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration.let(SecretsManagerAccessTokenConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1866a09a4118eb44d3a715ed2465a6ded5a1a5722f6b6958bdb47e09f0dfe2bf")
      override
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty.Builder.() -> Unit):
          Unit =
          secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty(secretsManagerAccessTokenConfiguration))

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty,
    ) : CdkObject(cdkObject), AccessConfigurationProperty {
      override fun accessType(): String? = unwrap(this).getAccessType()

      override fun secretsManagerAccessTokenConfiguration(): Any? =
          unwrap(this).getSecretsManagerAccessTokenConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty):
          AccessConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty
    }
  }
}
