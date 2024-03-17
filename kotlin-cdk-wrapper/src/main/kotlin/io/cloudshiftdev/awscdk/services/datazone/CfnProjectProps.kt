@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .glossaryTerms(List.of("glossaryTerms"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html)
 */
public interface CfnProjectProps {
  /**
   * The description of a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of a Amazon DataZone domain where the project exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The glossary terms that can be used in this Amazon DataZone project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
   */
  public fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  /**
   * The name of a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of a project.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    public fun glossaryTerms(glossaryTerms: List<String>)

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    public fun glossaryTerms(vararg glossaryTerms: String)

    /**
     * @param name The name of a project. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProjectProps.Builder =
        software.amazon.awscdk.services.datazone.CfnProjectProps.builder()

    /**
     * @param description The description of a project.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The identifier of a Amazon DataZone domain where the project exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    /**
     * @param glossaryTerms The glossary terms that can be used in this Amazon DataZone project.
     */
    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    /**
     * @param name The name of a project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    /**
     * The description of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of a Amazon DataZone domain where the project exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The glossary terms that can be used in this Amazon DataZone project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-glossaryterms)
     */
    override fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

    /**
     * The name of a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-project.html#cfn-datazone-project-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProps):
        CfnProjectProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProjectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.datazone.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.datazone.CfnProjectProps
  }
}
