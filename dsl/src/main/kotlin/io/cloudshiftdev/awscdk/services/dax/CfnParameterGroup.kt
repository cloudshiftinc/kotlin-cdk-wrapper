package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameterGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroup,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the parameter group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the parameter group.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the parameter group.
   */
  public open fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * The name of the parameter group.
   */
  public open fun parameterGroupName(`value`: String) {
    unwrap(this).setParameterGroupName(`value`)
  }

  /**
   * An array of name-value pairs for the parameters in the group.
   */
  public open fun parameterNameValues(): Any? = unwrap(this).getParameterNameValues()

  /**
   * An array of name-value pairs for the parameters in the group.
   */
  public open fun parameterNameValues(`value`: Any) {
    unwrap(this).setParameterNameValues(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dax.CfnParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description)
     * @param description A description of the parameter group. 
     */
    public fun description(description: String)

    /**
     * The name of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname)
     * @param parameterGroupName The name of the parameter group. 
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * An array of name-value pairs for the parameters in the group.
     *
     * Each element in the array represents a single parameter.
     *
     *
     * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
     * details, see [Configuring TTL
     * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues)
     * @param parameterNameValues An array of name-value pairs for the parameters in the group. 
     */
    public fun parameterNameValues(parameterNameValues: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnParameterGroup.Builder =
        software.amazon.awscdk.services.dax.CfnParameterGroup.Builder.create(scope, id)

    /**
     * A description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description)
     * @param description A description of the parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname)
     * @param parameterGroupName The name of the parameter group. 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * An array of name-value pairs for the parameters in the group.
     *
     * Each element in the array represents a single parameter.
     *
     *
     * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
     * details, see [Configuring TTL
     * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues)
     * @param parameterNameValues An array of name-value pairs for the parameters in the group. 
     */
    override fun parameterNameValues(parameterNameValues: Any) {
      cdkBuilder.parameterNameValues(parameterNameValues)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnParameterGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dax.CfnParameterGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroup):
        CfnParameterGroup = CfnParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroup):
        software.amazon.awscdk.services.dax.CfnParameterGroup = wrapped.cdkObject
  }
}
