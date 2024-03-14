package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnTemplateProps {
  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-connectorarn)
   */
  public fun connectorArn(): String

  /**
   * Template configuration to define the information included in certificates.
   *
   * Define certificate validity and renewal periods, certificate request handling and enrollment
   * options, key usage extensions, application policies, and cryptography settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
   */
  public fun definition(): Any

  /**
   * Name of the templates.
   *
   * Template names must be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-name)
   */
  public fun name(): String

  /**
   * This setting allows the major version of a template to be increased automatically.
   *
   * All members of Active Directory groups that are allowed to enroll with a template will receive
   * a new certificate issued using that template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
   */
  public fun reenrollAllCertificateHolders(): Any? = unwrap(this).getReenrollAllCertificateHolders()

  /**
   * Metadata assigned to a template consisting of a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * . 
     */
    public fun connectorArn(connectorArn: String)

    /**
     * @param definition Template configuration to define the information included in certificates. 
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition Template configuration to define the information included in certificates. 
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     */
    public fun definition(definition: CfnTemplate.TemplateDefinitionProperty)

    /**
     * @param definition Template configuration to define the information included in certificates. 
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2814a2e2a2d9883db05ba83870a913551aba713371765089f2353dc692e86ae4")
    public fun definition(definition: CfnTemplate.TemplateDefinitionProperty.Builder.() -> Unit)

    /**
     * @param name Name of the templates. 
     * Template names must be unique.
     */
    public fun name(name: String)

    /**
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically.
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     */
    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean)

    /**
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically.
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     */
    public fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable)

    /**
     * @param tags Metadata assigned to a template consisting of a key-value pair.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps.Builder
        = software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps.builder()

    /**
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * . 
     */
    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * @param definition Template configuration to define the information included in certificates. 
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * @param definition Template configuration to define the information included in certificates. 
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     */
    override fun definition(definition: CfnTemplate.TemplateDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnTemplate.TemplateDefinitionProperty::unwrap))
    }

    /**
     * @param definition Template configuration to define the information included in certificates. 
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2814a2e2a2d9883db05ba83870a913551aba713371765089f2353dc692e86ae4")
    override fun definition(definition: CfnTemplate.TemplateDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnTemplate.TemplateDefinitionProperty(definition))

    /**
     * @param name Name of the templates. 
     * Template names must be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically.
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     */
    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: Boolean) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders)
    }

    /**
     * @param reenrollAllCertificateHolders This setting allows the major version of a template to
     * be increased automatically.
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     */
    override fun reenrollAllCertificateHolders(reenrollAllCertificateHolders: IResolvable) {
      cdkBuilder.reenrollAllCertificateHolders(reenrollAllCertificateHolders.let(IResolvable::unwrap))
    }

    /**
     * @param tags Metadata assigned to a template consisting of a key-value pair.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateProps,
  ) : CdkObject(cdkObject), CfnTemplateProps {
    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-connectorarn)
     */
    override fun connectorArn(): String = unwrap(this).getConnectorArn()

    /**
     * Template configuration to define the information included in certificates.
     *
     * Define certificate validity and renewal periods, certificate request handling and enrollment
     * options, key usage extensions, application policies, and cryptography settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-definition)
     */
    override fun definition(): Any = unwrap(this).getDefinition()

    /**
     * Name of the templates.
     *
     * Template names must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * This setting allows the major version of a template to be increased automatically.
     *
     * All members of Active Directory groups that are allowed to enroll with a template will
     * receive a new certificate issued using that template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-reenrollallcertificateholders)
     */
    override fun reenrollAllCertificateHolders(): Any? =
        unwrap(this).getReenrollAllCertificateHolders()

    /**
     * Metadata assigned to a template consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-template.html#cfn-pcaconnectorad-template-tags)
     */
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
