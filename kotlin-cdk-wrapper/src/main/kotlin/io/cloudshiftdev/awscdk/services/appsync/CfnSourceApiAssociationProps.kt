@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSourceApiAssociationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun mergedApiIdentifier(): String? = unwrap(this).getMergedApiIdentifier()

  public fun sourceApiAssociationConfig(): Any? = unwrap(this).getSourceApiAssociationConfig()

  public fun sourceApiIdentifier(): String? = unwrap(this).getSourceApiIdentifier()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun mergedApiIdentifier(mergedApiIdentifier: String)

    public fun sourceApiAssociationConfig(sourceApiAssociationConfig: IResolvable)

    public
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: CfnSourceApiAssociation.SourceApiAssociationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f36c99d6f20840e2adccb4a003ba4d54fceb155ce46ed90de4890c776de06f32")
    public
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: CfnSourceApiAssociation.SourceApiAssociationConfigProperty.Builder.() -> Unit)

    public fun sourceApiIdentifier(sourceApiIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps.Builder =
        software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps.builder()

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
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: CfnSourceApiAssociation.SourceApiAssociationConfigProperty) {
      cdkBuilder.sourceApiAssociationConfig(sourceApiAssociationConfig.let(CfnSourceApiAssociation.SourceApiAssociationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f36c99d6f20840e2adccb4a003ba4d54fceb155ce46ed90de4890c776de06f32")
    override
        fun sourceApiAssociationConfig(sourceApiAssociationConfig: CfnSourceApiAssociation.SourceApiAssociationConfigProperty.Builder.() -> Unit):
        Unit =
        sourceApiAssociationConfig(CfnSourceApiAssociation.SourceApiAssociationConfigProperty(sourceApiAssociationConfig))

    override fun sourceApiIdentifier(sourceApiIdentifier: String) {
      cdkBuilder.sourceApiIdentifier(sourceApiIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps,
  ) : CdkObject(cdkObject), CfnSourceApiAssociationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun mergedApiIdentifier(): String? = unwrap(this).getMergedApiIdentifier()

    override fun sourceApiAssociationConfig(): Any? = unwrap(this).getSourceApiAssociationConfig()

    override fun sourceApiIdentifier(): String? = unwrap(this).getSourceApiIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSourceApiAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps):
        CfnSourceApiAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSourceApiAssociationProps):
        software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps
  }
}
