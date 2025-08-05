@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The summary of the domain unit.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnDomainUnit cfnDomainUnit = CfnDomainUnit.Builder.create(this, "MyCfnDomainUnit")
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
public open class CfnDomainUnit(
  cdkObject: software.amazon.awscdk.services.datazone.CfnDomainUnit,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainUnitProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnDomainUnit(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainUnitProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainUnitProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainUnitProps(props)
  )

  /**
   * The time stamp at which the domain unit was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ID of the domain in which the domain unit lives.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The ID of the domain unit.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The identifier of the domain unit that you want to get.
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * The timestamp at which the domain unit was last updated.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The ID of the parent domain unit.
   */
  public open fun attrParentDomainUnitId(): String = unwrap(this).getAttrParentDomainUnitId()

  /**
   * The description of the domain unit.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the domain unit.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the domain where you want to crate a domain unit.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The ID of the domain where you want to crate a domain unit.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the domain unit.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the domain unit.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ID of the parent domain unit.
   */
  public open fun parentDomainUnitIdentifier(): String =
      unwrap(this).getParentDomainUnitIdentifier()

  /**
   * The ID of the parent domain unit.
   */
  public open fun parentDomainUnitIdentifier(`value`: String) {
    unwrap(this).setParentDomainUnitIdentifier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnDomainUnit].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-description)
     * @param description The description of the domain unit. 
     */
    public fun description(description: String)

    /**
     * The ID of the domain where you want to crate a domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-domainidentifier)
     * @param domainIdentifier The ID of the domain where you want to crate a domain unit. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The name of the domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-name)
     * @param name The name of the domain unit. 
     */
    public fun name(name: String)

    /**
     * The ID of the parent domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-parentdomainunitidentifier)
     * @param parentDomainUnitIdentifier The ID of the parent domain unit. 
     */
    public fun parentDomainUnitIdentifier(parentDomainUnitIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDomainUnit.Builder =
        software.amazon.awscdk.services.datazone.CfnDomainUnit.Builder.create(scope, id)

    /**
     * The description of the domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-description)
     * @param description The description of the domain unit. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the domain where you want to crate a domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-domainidentifier)
     * @param domainIdentifier The ID of the domain where you want to crate a domain unit. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The name of the domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-name)
     * @param name The name of the domain unit. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ID of the parent domain unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domainunit.html#cfn-datazone-domainunit-parentdomainunitidentifier)
     * @param parentDomainUnitIdentifier The ID of the parent domain unit. 
     */
    override fun parentDomainUnitIdentifier(parentDomainUnitIdentifier: String) {
      cdkBuilder.parentDomainUnitIdentifier(parentDomainUnitIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnDomainUnit = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnDomainUnit.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainUnit {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainUnit(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomainUnit):
        CfnDomainUnit = CfnDomainUnit(cdkObject)

    internal fun unwrap(wrapped: CfnDomainUnit):
        software.amazon.awscdk.services.datazone.CfnDomainUnit = wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnDomainUnit
  }
}
