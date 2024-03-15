@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.healthlake

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFHIRDatastoreProps {
  public fun datastoreName(): String? = unwrap(this).getDatastoreName()

  public fun datastoreTypeVersion(): String

  public fun identityProviderConfiguration(): Any? = unwrap(this).getIdentityProviderConfiguration()

  public fun preloadDataConfig(): Any? = unwrap(this).getPreloadDataConfig()

  public fun sseConfiguration(): Any? = unwrap(this).getSseConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun datastoreName(datastoreName: String)

    public fun datastoreTypeVersion(datastoreTypeVersion: String)

    public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable)

    public
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45755fdf68254141e2b75c6c8cccefe78b8ed2d1f3426f0340d49596a8a3754e")
    public
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder.() -> Unit)

    public fun preloadDataConfig(preloadDataConfig: IResolvable)

    public fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a132be8301b86ccda20d3511b8b35da5cd9714d6d6004087e3050216cdb2299c")
    public
        fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty.Builder.() -> Unit)

    public fun sseConfiguration(sseConfiguration: IResolvable)

    public fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68bf6021640c6faa3c708d58dcad10fdd4c4fb0ed08b9173028476b4723a5de3")
    public
        fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps.Builder
        = software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps.builder()

    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    override fun datastoreTypeVersion(datastoreTypeVersion: String) {
      cdkBuilder.datastoreTypeVersion(datastoreTypeVersion)
    }

    override fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IResolvable::unwrap))
    }

    override
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(CfnFHIRDatastore.IdentityProviderConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45755fdf68254141e2b75c6c8cccefe78b8ed2d1f3426f0340d49596a8a3754e")
    override
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder.() -> Unit):
        Unit =
        identityProviderConfiguration(CfnFHIRDatastore.IdentityProviderConfigurationProperty(identityProviderConfiguration))

    override fun preloadDataConfig(preloadDataConfig: IResolvable) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(IResolvable::unwrap))
    }

    override fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(CfnFHIRDatastore.PreloadDataConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a132be8301b86ccda20d3511b8b35da5cd9714d6d6004087e3050216cdb2299c")
    override
        fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty.Builder.() -> Unit):
        Unit = preloadDataConfig(CfnFHIRDatastore.PreloadDataConfigProperty(preloadDataConfig))

    override fun sseConfiguration(sseConfiguration: IResolvable) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(IResolvable::unwrap))
    }

    override fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(CfnFHIRDatastore.SseConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68bf6021640c6faa3c708d58dcad10fdd4c4fb0ed08b9173028476b4723a5de3")
    override
        fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty.Builder.() -> Unit):
        Unit = sseConfiguration(CfnFHIRDatastore.SseConfigurationProperty(sseConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps,
  ) : CdkObject(cdkObject), CfnFHIRDatastoreProps {
    override fun datastoreName(): String? = unwrap(this).getDatastoreName()

    override fun datastoreTypeVersion(): String = unwrap(this).getDatastoreTypeVersion()

    override fun identityProviderConfiguration(): Any? =
        unwrap(this).getIdentityProviderConfiguration()

    override fun preloadDataConfig(): Any? = unwrap(this).getPreloadDataConfig()

    override fun sseConfiguration(): Any? = unwrap(this).getSseConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFHIRDatastoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps):
        CfnFHIRDatastoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFHIRDatastoreProps):
        software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps
  }
}
