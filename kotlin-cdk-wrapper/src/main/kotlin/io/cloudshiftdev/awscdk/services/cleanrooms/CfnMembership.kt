@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMembership internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCollaborationArn(): String = unwrap(this).getAttrCollaborationArn()

  public open fun attrCollaborationCreatorAccountId(): String =
      unwrap(this).getAttrCollaborationCreatorAccountId()

  public open fun attrMembershipIdentifier(): String = unwrap(this).getAttrMembershipIdentifier()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun collaborationIdentifier(): String = unwrap(this).getCollaborationIdentifier()

  public open fun collaborationIdentifier(`value`: String) {
    unwrap(this).setCollaborationIdentifier(`value`)
  }

  public open fun defaultResultConfiguration(): Any? = unwrap(this).getDefaultResultConfiguration()

  public open fun defaultResultConfiguration(`value`: IResolvable) {
    unwrap(this).setDefaultResultConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun defaultResultConfiguration(`value`: MembershipProtectedQueryResultConfigurationProperty) {
    unwrap(this).setDefaultResultConfiguration(`value`.let(MembershipProtectedQueryResultConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11e31fd9aaeb3a89524d9fbefae14a057b8bf26feeab297ec9ef986b2bd87f3e")
  public open
      fun defaultResultConfiguration(`value`: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit):
      Unit =
      defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

  public open fun paymentConfiguration(`value`: IResolvable) {
    unwrap(this).setPaymentConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun paymentConfiguration(`value`: MembershipPaymentConfigurationProperty) {
    unwrap(this).setPaymentConfiguration(`value`.let(MembershipPaymentConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a31f3ad321ba01ad951334da843b4763ff03d4bcb24dd2eaabd60b8699eb7f3a")
  public open
      fun paymentConfiguration(`value`: MembershipPaymentConfigurationProperty.Builder.() -> Unit):
      Unit = paymentConfiguration(MembershipPaymentConfigurationProperty(`value`))

  public open fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

  public open fun queryLogStatus(`value`: String) {
    unwrap(this).setQueryLogStatus(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun collaborationIdentifier(collaborationIdentifier: String)

    public fun defaultResultConfiguration(defaultResultConfiguration: IResolvable)

    public
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff10055830626e7a3e8e88058441fda25c39c687a5dc20f0ad94ad925fbcf884")
    public
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit)

    public fun paymentConfiguration(paymentConfiguration: IResolvable)

    public fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9448e8539ccbb7c90896b2c06fdc1dc42d633ae9b6cd07facc40e0ff0d79fe3b")
    public
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty.Builder.() -> Unit)

    public fun queryLogStatus(queryLogStatus: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnMembership.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnMembership.Builder.create(scope, id)

    override fun collaborationIdentifier(collaborationIdentifier: String) {
      cdkBuilder.collaborationIdentifier(collaborationIdentifier)
    }

    override fun defaultResultConfiguration(defaultResultConfiguration: IResolvable) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(IResolvable::unwrap))
    }

    override
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(MembershipProtectedQueryResultConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff10055830626e7a3e8e88058441fda25c39c687a5dc20f0ad94ad925fbcf884")
    override
        fun defaultResultConfiguration(defaultResultConfiguration: MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultResultConfiguration(MembershipProtectedQueryResultConfigurationProperty(defaultResultConfiguration))

    override fun paymentConfiguration(paymentConfiguration: IResolvable) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(MembershipPaymentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9448e8539ccbb7c90896b2c06fdc1dc42d633ae9b6cd07facc40e0ff0d79fe3b")
    override
        fun paymentConfiguration(paymentConfiguration: MembershipPaymentConfigurationProperty.Builder.() -> Unit):
        Unit = paymentConfiguration(MembershipPaymentConfigurationProperty(paymentConfiguration))

    override fun queryLogStatus(queryLogStatus: String) {
      cdkBuilder.queryLogStatus(queryLogStatus)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnMembership =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnMembership.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMembership {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMembership(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership):
        CfnMembership = CfnMembership(cdkObject)

    internal fun unwrap(wrapped: CfnMembership):
        software.amazon.awscdk.services.cleanrooms.CfnMembership = wrapped.cdkObject
  }

  public interface MembershipPaymentConfigurationProperty {
    public fun queryCompute(): Any

    @CdkDslMarker
    public interface Builder {
      public fun queryCompute(queryCompute: IResolvable)

      public fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99db9738787f7ef099be61fcf4a886932773ebc185510d1ce209505a4bf570fe")
      public
          fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty.builder()

      override fun queryCompute(queryCompute: IResolvable) {
        cdkBuilder.queryCompute(queryCompute.let(IResolvable::unwrap))
      }

      override fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty) {
        cdkBuilder.queryCompute(queryCompute.let(MembershipQueryComputePaymentConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99db9738787f7ef099be61fcf4a886932773ebc185510d1ce209505a4bf570fe")
      override
          fun queryCompute(queryCompute: MembershipQueryComputePaymentConfigProperty.Builder.() -> Unit):
          Unit = queryCompute(MembershipQueryComputePaymentConfigProperty(queryCompute))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty,
    ) : CdkObject(cdkObject), MembershipPaymentConfigurationProperty {
      override fun queryCompute(): Any = unwrap(this).getQueryCompute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipPaymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty):
          MembershipPaymentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipPaymentConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipPaymentConfigurationProperty
    }
  }

  public interface ProtectedQueryS3OutputConfigurationProperty {
    public fun bucket(): String

    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    public fun resultFormat(): String

    @CdkDslMarker
    public interface Builder {
      public fun bucket(bucket: String)

      public fun keyPrefix(keyPrefix: String)

      public fun resultFormat(resultFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      override fun resultFormat(resultFormat: String) {
        cdkBuilder.resultFormat(resultFormat)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty,
    ) : CdkObject(cdkObject), ProtectedQueryS3OutputConfigurationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

      override fun resultFormat(): String = unwrap(this).getResultFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProtectedQueryS3OutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty):
          ProtectedQueryS3OutputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtectedQueryS3OutputConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.ProtectedQueryS3OutputConfigurationProperty
    }
  }

  public interface MembershipQueryComputePaymentConfigProperty {
    public fun isResponsible(): Any

    @CdkDslMarker
    public interface Builder {
      public fun isResponsible(isResponsible: Boolean)

      public fun isResponsible(isResponsible: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty.builder()

      override fun isResponsible(isResponsible: Boolean) {
        cdkBuilder.isResponsible(isResponsible)
      }

      override fun isResponsible(isResponsible: IResolvable) {
        cdkBuilder.isResponsible(isResponsible.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty,
    ) : CdkObject(cdkObject), MembershipQueryComputePaymentConfigProperty {
      override fun isResponsible(): Any = unwrap(this).getIsResponsible()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipQueryComputePaymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty):
          MembershipQueryComputePaymentConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipQueryComputePaymentConfigProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipQueryComputePaymentConfigProperty
    }
  }

  public interface MembershipProtectedQueryResultConfigurationProperty {
    public fun outputConfiguration(): Any

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun outputConfiguration(outputConfiguration: IResolvable)

      public
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a26914910069f23c97364d93aff5d276755a5650cbd67e26be4291735331f4")
      public
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty.builder()

      override fun outputConfiguration(outputConfiguration: IResolvable) {
        cdkBuilder.outputConfiguration(outputConfiguration.let(IResolvable::unwrap))
      }

      override
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty) {
        cdkBuilder.outputConfiguration(outputConfiguration.let(MembershipProtectedQueryOutputConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a26914910069f23c97364d93aff5d276755a5650cbd67e26be4291735331f4")
      override
          fun outputConfiguration(outputConfiguration: MembershipProtectedQueryOutputConfigurationProperty.Builder.() -> Unit):
          Unit =
          outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty(outputConfiguration))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty,
    ) : CdkObject(cdkObject), MembershipProtectedQueryResultConfigurationProperty {
      override fun outputConfiguration(): Any = unwrap(this).getOutputConfiguration()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedQueryResultConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty):
          MembershipProtectedQueryResultConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedQueryResultConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryResultConfigurationProperty
    }
  }

  public interface MembershipProtectedQueryOutputConfigurationProperty {
    public fun s3(): Any

    @CdkDslMarker
    public interface Builder {
      public fun s3(s3: IResolvable)

      public fun s3(s3: ProtectedQueryS3OutputConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2597a2165549dafd127ba9eee175ac3ddd48f847c4150eae23d54c4edf57e86")
      public fun s3(s3: ProtectedQueryS3OutputConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty.builder()

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: ProtectedQueryS3OutputConfigurationProperty) {
        cdkBuilder.s3(s3.let(ProtectedQueryS3OutputConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2597a2165549dafd127ba9eee175ac3ddd48f847c4150eae23d54c4edf57e86")
      override fun s3(s3: ProtectedQueryS3OutputConfigurationProperty.Builder.() -> Unit): Unit =
          s3(ProtectedQueryS3OutputConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty,
    ) : CdkObject(cdkObject), MembershipProtectedQueryOutputConfigurationProperty {
      override fun s3(): Any = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MembershipProtectedQueryOutputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty):
          MembershipProtectedQueryOutputConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MembershipProtectedQueryOutputConfigurationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
    }
  }
}
