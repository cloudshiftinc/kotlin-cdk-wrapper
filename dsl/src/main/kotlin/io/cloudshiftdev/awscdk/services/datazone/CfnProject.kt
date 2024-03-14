package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datazone.CfnProject,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The timestamp of when a project was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon DataZone user who created the project.
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The identifier of a project.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The timestamp of when the project was last updated.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The description of a project.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of a project.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   */
  public open fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   */
  public open fun glossaryTerms(`value`: List<String>) {
    unwrap(this).setGlossaryTerms(`value`)
  }

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   */
  public open fun glossaryTerms(vararg `value`: String): Unit = glossaryTerms(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of a project.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a project.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
     * @param description The description of a project. 
     */
    public fun description(description: String)

    /**
     * The identifier of a Amazon DataZone domain where the project exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    public fun glossaryTerms(glossaryTerms: List<String>)

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    public fun glossaryTerms(vararg glossaryTerms: String)

    /**
     * The name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
     * @param name The name of a project. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProject.Builder =
        software.amazon.awscdk.services.datazone.CfnProject.Builder.create(scope, id)

    /**
     * The description of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
     * @param description The description of a project. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of a Amazon DataZone domain where the project exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project. 
     */
    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    /**
     * The name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
     * @param name The name of a project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.datazone.CfnProject =
        wrapped.cdkObject
  }
}
