package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSourceApiAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnSourceApiAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAssociationArn(): String = unwrap(this).getAttrAssociationArn()

  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  public open fun attrLastSuccessfulMergeDate(): String =
      unwrap(this).getAttrLastSuccessfulMergeDate()

  public open fun attrMergedApiArn(): String = unwrap(this).getAttrMergedApiArn()

  public open fun attrMergedApiId(): String = unwrap(this).getAttrMergedApiId()

  public open fun attrSourceApiArn(): String = unwrap(this).getAttrSourceApiArn()

  public open fun attrSourceApiAssociationStatus(): String =
      unwrap(this).getAttrSourceApiAssociationStatus()

  public open fun attrSourceApiAssociationStatusDetail(): String =
      unwrap(this).getAttrSourceApiAssociationStatusDetail()

  public open fun attrSourceApiId(): String = unwrap(this).getAttrSourceApiId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mergedApiIdentifier(): String? = unwrap(this).getMergedApiIdentifier()

  public open fun mergedApiIdentifier(`value`: String) {
    unwrap(this).setMergedApiIdentifier(`value`)
  }

  public open fun sourceApiAssociationConfig(): Any? = unwrap(this).getSourceApiAssociationConfig()

  public open fun sourceApiAssociationConfig(`value`: IResolvable) {
    unwrap(this).setSourceApiAssociationConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceApiAssociationConfig(`value`: SourceApiAssociationConfigProperty) {
    unwrap(this).setSourceApiAssociationConfig(`value`.let(SourceApiAssociationConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1bce05f541ba7087b1072d6d8719c04c39d66c9ea93eb11905c18f00dc120ee")
  public open
      fun sourceApiAssociationConfig(`value`: SourceApiAssociationConfigProperty.Builder.() -> Unit):
      Unit = sourceApiAssociationConfig(SourceApiAssociationConfigProperty(`value`))

  public open fun sourceApiIdentifier(): String? = unwrap(this).getSourceApiIdentifier()

  public open fun sourceApiIdentifier(`value`: String) {
    unwrap(this).setSourceApiIdentifier(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun mergedApiIdentifier(mergedApiIdentifier: String)

    public fun sourceApiAssociationConfig(sourceApiAssociationConfig: IResolvable)

    public
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: SourceApiAssociationConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b83545ef86d3cef4902a53c5fc8e79af6c7e41f53f252afb692d4e978d0745c2")
    public
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: SourceApiAssociationConfigProperty.Builder.() -> Unit)

    public fun sourceApiIdentifier(sourceApiIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.Builder
        = software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun mergedApiIdentifier(mergedApiIdentifier: String) {
      cdkBuilder.mergedApiIdentifier(mergedApiIdentifier)
    }

    override fun sourceApiAssociationConfig(sourceApiAssociationConfig: IResolvable) {
      cdkBuilder.sourceApiAssociationConfig(sourceApiAssociationConfig.let(IResolvable::unwrap))
    }

    override
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: SourceApiAssociationConfigProperty) {
      cdkBuilder.sourceApiAssociationConfig(sourceApiAssociationConfig.let(SourceApiAssociationConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b83545ef86d3cef4902a53c5fc8e79af6c7e41f53f252afb692d4e978d0745c2")
    override
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: SourceApiAssociationConfigProperty.Builder.() -> Unit):
        Unit =
        sourceApiAssociationConfig(SourceApiAssociationConfigProperty(sourceApiAssociationConfig))

    override fun sourceApiIdentifier(sourceApiIdentifier: String) {
      cdkBuilder.sourceApiIdentifier(sourceApiIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnSourceApiAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSourceApiAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSourceApiAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnSourceApiAssociation):
        CfnSourceApiAssociation = CfnSourceApiAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnSourceApiAssociation):
        software.amazon.awscdk.services.appsync.CfnSourceApiAssociation = wrapped.cdkObject
  }

  public interface SourceApiAssociationConfigProperty {
    public fun mergeType(): String? = unwrap(this).getMergeType()

    public interface Builder {
      public fun mergeType(mergeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.SourceApiAssociationConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.SourceApiAssociationConfigProperty.builder()

      override fun mergeType(mergeType: String) {
        cdkBuilder.mergeType(mergeType)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.SourceApiAssociationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.SourceApiAssociationConfigProperty,
    ) : SourceApiAssociationConfigProperty {
      override fun mergeType(): String? = unwrap(this).getMergeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceApiAssociationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.SourceApiAssociationConfigProperty):
          SourceApiAssociationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceApiAssociationConfigProperty):
          software.amazon.awscdk.services.appsync.CfnSourceApiAssociation.SourceApiAssociationConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
