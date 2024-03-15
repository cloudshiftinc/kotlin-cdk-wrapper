@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnTemplateProps {
  public fun connectorArn(): String

  public fun definition(): Any

  public fun name(): String

  public fun reenrollAllCertificateHolders(): Any? = unwrap(this).getReenrollAllCertificateHolders()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun connectorArn(connectorArn: String)

    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnTemplate.TemplateDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2814a2e2a2d9883db05ba83870a913551aba713371765089f2353dc692e86ae4")
    public fun definition(definition: CfnTemplate.TemplateDefinitionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean)

    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps.Builder
        = software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps.builder()

    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnTemplate.TemplateDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnTemplate.TemplateDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2814a2e2a2d9883db05ba83870a913551aba713371765089f2353dc692e86ae4")
    override fun definition(definition: CfnTemplate.TemplateDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnTemplate.TemplateDefinitionProperty(definition))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders)
    }

    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders.let(IResolvable::unwrap))
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps,
  ) : CdkObject(cdkObject), CfnTemplateProps {
    override fun connectorArn(): String = unwrap(this).getConnectorArn()

    override fun definition(): Any = unwrap(this).getDefinition()

    override fun name(): String = unwrap(this).getName()

    override fun reenrollAllCertificateHolders(): Any? =
        unwrap(this).getReenrollAllCertificateHolders()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps):
        CfnTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps
  }
}
