@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnIndexProps {
  public fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

  public fun description(): String? = unwrap(this).getDescription()

  public fun documentMetadataConfigurations(): Any? =
      unwrap(this).getDocumentMetadataConfigurations()

  public fun edition(): String

  public fun name(): String

  public fun roleArn(): String

  public fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userContextPolicy(): String? = unwrap(this).getUserContextPolicy()

  public fun userTokenConfigurations(): Any? = unwrap(this).getUserTokenConfigurations()

  @CdkDslMarker
  public interface Builder {
    public fun capacityUnits(capacityUnits: IResolvable)

    public fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16cfd4975b9ec234e3de524cea4605f951ad5cdbb84f8b0df1e0bc0c2abddaee")
    public
        fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable)

    public fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>)

    public fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any)

    public fun edition(edition: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9abf9865f05fedb50816bdb00d1151c51d286031f7b3e6f48020e08578c8e0b")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userContextPolicy(userContextPolicy: String)

    public fun userTokenConfigurations(userTokenConfigurations: IResolvable)

    public fun userTokenConfigurations(userTokenConfigurations: List<Any>)

    public fun userTokenConfigurations(vararg userTokenConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnIndexProps.Builder =
        software.amazon.awscdk.services.kendra.CfnIndexProps.builder()

    override fun capacityUnits(capacityUnits: IResolvable) {
      cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
    }

    override fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty) {
      cdkBuilder.capacityUnits(capacityUnits.let(CfnIndex.CapacityUnitsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16cfd4975b9ec234e3de524cea4605f951ad5cdbb84f8b0df1e0bc0c2abddaee")
    override
        fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty.Builder.() -> Unit):
        Unit = capacityUnits(CfnIndex.CapacityUnitsConfigurationProperty(capacityUnits))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable) {
      cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations.let(IResolvable::unwrap))
    }

    override fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>) {
      cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations)
    }

    override fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any): Unit =
        documentMetadataConfigurations(documentMetadataConfigurations.toList())

    override fun edition(edition: String) {
      cdkBuilder.edition(edition)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(CfnIndex.ServerSideEncryptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9abf9865f05fedb50816bdb00d1151c51d286031f7b3e6f48020e08578c8e0b")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(CfnIndex.ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userContextPolicy(userContextPolicy: String) {
      cdkBuilder.userContextPolicy(userContextPolicy)
    }

    override fun userTokenConfigurations(userTokenConfigurations: IResolvable) {
      cdkBuilder.userTokenConfigurations(userTokenConfigurations.let(IResolvable::unwrap))
    }

    override fun userTokenConfigurations(userTokenConfigurations: List<Any>) {
      cdkBuilder.userTokenConfigurations(userTokenConfigurations)
    }

    override fun userTokenConfigurations(vararg userTokenConfigurations: Any): Unit =
        userTokenConfigurations(userTokenConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.kendra.CfnIndexProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kendra.CfnIndexProps,
  ) : CdkObject(cdkObject), CfnIndexProps {
    override fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

    override fun description(): String? = unwrap(this).getDescription()

    override fun documentMetadataConfigurations(): Any? =
        unwrap(this).getDocumentMetadataConfigurations()

    override fun edition(): String = unwrap(this).getEdition()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun serverSideEncryptionConfiguration(): Any? =
        unwrap(this).getServerSideEncryptionConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userContextPolicy(): String? = unwrap(this).getUserContextPolicy()

    override fun userTokenConfigurations(): Any? = unwrap(this).getUserTokenConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndexProps):
        CfnIndexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIndexProps):
        software.amazon.awscdk.services.kendra.CfnIndexProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kendra.CfnIndexProps
  }
}
