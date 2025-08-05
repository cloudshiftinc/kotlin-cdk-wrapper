@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDomainUnit`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnDomainUnitProps cfnDomainUnitProps = CfnDomainUnitProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .name("name")
 * .parentDomainUnitIdentifier("parentDomainUnitIdentifier")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html)
 */
public interface CfnDomainUnitProps {
  /**
   * The description of the domain unit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the domain where you want to crate a domain unit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The name of the domain unit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-name)
   */
  public fun name(): String

  /**
   * The ID of the parent domain unit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-parentdomainunitidentifier)
   */
  public fun parentDomainUnitIdentifier(): String

  /**
   * A builder for [CfnDomainUnitProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the domain unit.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The ID of the domain where you want to crate a domain unit. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param name The name of the domain unit. 
     */
    public fun name(name: String)

    /**
     * @param parentDomainUnitIdentifier The ID of the parent domain unit. 
     */
    public fun parentDomainUnitIdentifier(parentDomainUnitIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDomainUnitProps.Builder =
        software.amazon.awscdk.services.datazone.CfnDomainUnitProps.builder()

    /**
     * @param description The description of the domain unit.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The ID of the domain where you want to crate a domain unit. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param name The name of the domain unit. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parentDomainUnitIdentifier The ID of the parent domain unit. 
     */
    override fun parentDomainUnitIdentifier(parentDomainUnitIdentifier: String) {
      cdkBuilder.parentDomainUnitIdentifier(parentDomainUnitIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnDomainUnitProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnDomainUnitProps,
  ) : CdkObject(cdkObject),
      CfnDomainUnitProps {
    /**
     * The description of the domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the domain where you want to crate a domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The name of the domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ID of the parent domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-parentdomainunitidentifier)
     */
    override fun parentDomainUnitIdentifier(): String = unwrap(this).getParentDomainUnitIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainUnitProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomainUnitProps):
        CfnDomainUnitProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainUnitProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainUnitProps):
        software.amazon.awscdk.services.datazone.CfnDomainUnitProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnDomainUnitProps
  }
}
