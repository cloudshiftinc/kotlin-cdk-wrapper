@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a TagOption.
 *
 * A TagOption is a key-value pair managed by AWS Service Catalog that serves as a template for
 * creating an AWS tag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnTagOption cfnTagOption = CfnTagOption.Builder.create(this, "MyCfnTagOption")
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .active(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html)
 */
public open class CfnTagOption(
  cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOption,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagOptionProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.CfnTagOption(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTagOptionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagOptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTagOptionProps(props)
  )

  /**
   * The TagOption active state.
   */
  public open fun active(): Any? = unwrap(this).getActive()

  /**
   * The TagOption active state.
   */
  public open fun active(`value`: Boolean) {
    unwrap(this).setActive(`value`)
  }

  /**
   * The TagOption active state.
   */
  public open fun active(`value`: IResolvable) {
    unwrap(this).setActive(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The TagOption identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The TagOption key.
   */
  public open fun key(): String = unwrap(this).getKey()

  /**
   * The TagOption key.
   */
  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  /**
   * The TagOption value.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  /**
   * The TagOption value.
   */
  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CfnTagOption].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The TagOption active state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
     * @param active The TagOption active state. 
     */
    public fun active(active: Boolean)

    /**
     * The TagOption active state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
     * @param active The TagOption active state. 
     */
    public fun active(active: IResolvable)

    /**
     * The TagOption key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
     * @param key The TagOption key. 
     */
    public fun key(key: String)

    /**
     * The TagOption value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
     * @param value The TagOption value. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnTagOption.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnTagOption.Builder.create(scope, id)

    /**
     * The TagOption active state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
     * @param active The TagOption active state. 
     */
    override fun active(active: Boolean) {
      cdkBuilder.active(active)
    }

    /**
     * The TagOption active state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
     * @param active The TagOption active state. 
     */
    override fun active(active: IResolvable) {
      cdkBuilder.active(active.let(IResolvable.Companion::unwrap))
    }

    /**
     * The TagOption key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
     * @param key The TagOption key. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * The TagOption value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
     * @param value The TagOption value. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOption =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalog.CfnTagOption.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTagOption {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTagOption(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOption):
        CfnTagOption = CfnTagOption(cdkObject)

    internal fun unwrap(wrapped: CfnTagOption):
        software.amazon.awscdk.services.servicecatalog.CfnTagOption = wrapped.cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnTagOption
  }
}
