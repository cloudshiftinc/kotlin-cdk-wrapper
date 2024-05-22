@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sdb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::SDB::Domain` resource to declare a SimpleDB domain.
 *
 * When you specify `AWS::SDB::Domain` as an argument in a `Ref` function, AWS CloudFormation
 * returns the value of the `DomainName` .
 *
 *
 * The `AWS::SDB::Domain` resource does not allow any updates, including metadata updates.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sdb.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html)
 */
public open class CfnDomain(
  cdkObject: software.amazon.awscdk.services.sdb.CfnDomain,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sdb.CfnDomain(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps,
  ) :
      this(software.amazon.awscdk.services.sdb.CfnDomain(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Information about the SimpleDB domain.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Information about the SimpleDB domain.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sdb.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about the SimpleDB domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html#cfn-sdb-domain-description)
     * @param description Information about the SimpleDB domain. 
     */
    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sdb.CfnDomain.Builder =
        software.amazon.awscdk.services.sdb.CfnDomain.Builder.create(scope, id)

    /**
     * Information about the SimpleDB domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html#cfn-sdb-domain-description)
     * @param description Information about the SimpleDB domain. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.sdb.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sdb.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sdb.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.sdb.CfnDomain =
        wrapped.cdkObject as software.amazon.awscdk.services.sdb.CfnDomain
  }
}
