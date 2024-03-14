package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTaskTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the task template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
   */
  public open fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
   */
  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  /**
   * Constraints that are applicable to the fields listed.
   */
  public open fun constraints(): Any? = unwrap(this).getConstraints()

  /**
   * Constraints that are applicable to the fields listed.
   */
  public open fun constraints(`value`: Any) {
    unwrap(this).setConstraints(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the flow that runs by default when a task is created by
   * referencing this template.
   */
  public open fun contactFlowArn(): String? = unwrap(this).getContactFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the flow that runs by default when a task is created by
   * referencing this template.
   */
  public open fun contactFlowArn(`value`: String) {
    unwrap(this).setContactFlowArn(`value`)
  }

  /**
   * The default values for fields when a task is created by referencing this template.
   */
  public open fun defaults(): Any? = unwrap(this).getDefaults()

  /**
   * The default values for fields when a task is created by referencing this template.
   */
  public open fun defaults(`value`: IResolvable) {
    unwrap(this).setDefaults(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default values for fields when a task is created by referencing this template.
   */
  public open fun defaults(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefaults(__idx_ac66f0)
  }

  /**
   * The default values for fields when a task is created by referencing this template.
   */
  public open fun defaults(vararg __idx_ac66f0: Any): Unit = defaults(__idx_ac66f0.toList())

  /**
   * The description of the task template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the task template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Fields that are part of the template.
   */
  public open fun fields(): Any? = unwrap(this).getFields()

  /**
   * Fields that are part of the template.
   */
  public open fun fields(`value`: IResolvable) {
    unwrap(this).setFields(`value`.let(IResolvable::unwrap))
  }

  /**
   * Fields that are part of the template.
   */
  public open fun fields(__idx_ac66f0: List<Any>) {
    unwrap(this).setFields(__idx_ac66f0)
  }

  /**
   * Fields that are part of the template.
   */
  public open fun fields(vararg __idx_ac66f0: Any): Unit = fields(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the task template.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the task template.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The status of the task template.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of the task template.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnTaskTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-clienttoken)
     * @param clientToken A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. 
     */
    public fun clientToken(clientToken: String)

    /**
     * Constraints that are applicable to the fields listed.
     *
     * The values can be represented in either JSON or YAML format. For an example of the JSON
     * configuration, see *Examples* at the bottom of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-constraints)
     * @param constraints Constraints that are applicable to the fields listed. 
     */
    public fun constraints(constraints: Any)

    /**
     * The Amazon Resource Name (ARN) of the flow that runs by default when a task is created by
     * referencing this template.
     *
     * `ContactFlowArn` is not required when there is a field with `fieldType` = `QUICK_CONNECT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-contactflowarn)
     * @param contactFlowArn The Amazon Resource Name (ARN) of the flow that runs by default when a
     * task is created by referencing this template. 
     */
    public fun contactFlowArn(contactFlowArn: String)

    /**
     * The default values for fields when a task is created by referencing this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
     * @param defaults The default values for fields when a task is created by referencing this
     * template. 
     */
    public fun defaults(defaults: IResolvable)

    /**
     * The default values for fields when a task is created by referencing this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
     * @param defaults The default values for fields when a task is created by referencing this
     * template. 
     */
    public fun defaults(defaults: List<Any>)

    /**
     * The default values for fields when a task is created by referencing this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
     * @param defaults The default values for fields when a task is created by referencing this
     * template. 
     */
    public fun defaults(vararg defaults: Any)

    /**
     * The description of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-description)
     * @param description The description of the task template. 
     */
    public fun description(description: String)

    /**
     * Fields that are part of the template.
     *
     * A template requires at least one field that has type `Name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
     * @param fields Fields that are part of the template. 
     */
    public fun fields(fields: IResolvable)

    /**
     * Fields that are part of the template.
     *
     * A template requires at least one field that has type `Name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
     * @param fields Fields that are part of the template. 
     */
    public fun fields(fields: List<Any>)

    /**
     * Fields that are part of the template.
     *
     * A template requires at least one field that has type `Name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
     * @param fields Fields that are part of the template. 
     */
    public fun fields(vararg fields: Any)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-name)
     * @param name The name of the task template. 
     */
    public fun name(name: String)

    /**
     * The status of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-status)
     * @param status The status of the task template. 
     */
    public fun status(status: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnTaskTemplate.Builder =
        software.amazon.awscdk.services.connect.CfnTaskTemplate.Builder.create(scope, id)

    /**
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-clienttoken)
     * @param clientToken A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * Constraints that are applicable to the fields listed.
     *
     * The values can be represented in either JSON or YAML format. For an example of the JSON
     * configuration, see *Examples* at the bottom of this page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-constraints)
     * @param constraints Constraints that are applicable to the fields listed. 
     */
    override fun constraints(constraints: Any) {
      cdkBuilder.constraints(constraints)
    }

    /**
     * The Amazon Resource Name (ARN) of the flow that runs by default when a task is created by
     * referencing this template.
     *
     * `ContactFlowArn` is not required when there is a field with `fieldType` = `QUICK_CONNECT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-contactflowarn)
     * @param contactFlowArn The Amazon Resource Name (ARN) of the flow that runs by default when a
     * task is created by referencing this template. 
     */
    override fun contactFlowArn(contactFlowArn: String) {
      cdkBuilder.contactFlowArn(contactFlowArn)
    }

    /**
     * The default values for fields when a task is created by referencing this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
     * @param defaults The default values for fields when a task is created by referencing this
     * template. 
     */
    override fun defaults(defaults: IResolvable) {
      cdkBuilder.defaults(defaults.let(IResolvable::unwrap))
    }

    /**
     * The default values for fields when a task is created by referencing this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
     * @param defaults The default values for fields when a task is created by referencing this
     * template. 
     */
    override fun defaults(defaults: List<Any>) {
      cdkBuilder.defaults(defaults)
    }

    /**
     * The default values for fields when a task is created by referencing this template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-defaults)
     * @param defaults The default values for fields when a task is created by referencing this
     * template. 
     */
    override fun defaults(vararg defaults: Any): Unit = defaults(defaults.toList())

    /**
     * The description of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-description)
     * @param description The description of the task template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Fields that are part of the template.
     *
     * A template requires at least one field that has type `Name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
     * @param fields Fields that are part of the template. 
     */
    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    /**
     * Fields that are part of the template.
     *
     * A template requires at least one field that has type `Name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
     * @param fields Fields that are part of the template. 
     */
    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    /**
     * Fields that are part of the template.
     *
     * A template requires at least one field that has type `Name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-fields)
     * @param fields Fields that are part of the template. 
     */
    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-name)
     * @param name The name of the task template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The status of the task template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-status)
     * @param status The status of the task template. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html#cfn-connect-tasktemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnTaskTemplate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate):
        CfnTaskTemplate = CfnTaskTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnTaskTemplate):
        software.amazon.awscdk.services.connect.CfnTaskTemplate = wrapped.cdkObject
  }

  public interface RequiredFieldInfoProperty {
    /**
     * The unique identifier for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-requiredfieldinfo.html#cfn-connect-tasktemplate-requiredfieldinfo-id)
     */
    public fun id(): Any

    /**
     * A builder for [RequiredFieldInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The unique identifier for the field. 
       */
      public fun id(id: IResolvable)

      /**
       * @param id The unique identifier for the field. 
       */
      public fun id(id: FieldIdentifierProperty)

      /**
       * @param id The unique identifier for the field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8836cf4a1cef8abe32a187435262548eed16cd66a6b525ff3eae5b51c84deacf")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty.builder()

      /**
       * @param id The unique identifier for the field. 
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      /**
       * @param id The unique identifier for the field. 
       */
      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param id The unique identifier for the field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8836cf4a1cef8abe32a187435262548eed16cd66a6b525ff3eae5b51c84deacf")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty,
    ) : RequiredFieldInfoProperty {
      /**
       * The unique identifier for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-requiredfieldinfo.html#cfn-connect-tasktemplate-requiredfieldinfo-id)
       */
      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequiredFieldInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty):
          RequiredFieldInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequiredFieldInfoProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.RequiredFieldInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConstraintsProperty {
    /**
     * Lists the fields that are invisible to agents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html#cfn-connect-tasktemplate-constraints-invisiblefields)
     */
    public fun invisibleFields(): Any? = unwrap(this).getInvisibleFields()

    /**
     * Lists the fields that are read-only to agents, and cannot be edited.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html#cfn-connect-tasktemplate-constraints-readonlyfields)
     */
    public fun readOnlyFields(): Any? = unwrap(this).getReadOnlyFields()

    /**
     * Lists the fields that are required to be filled by agents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html#cfn-connect-tasktemplate-constraints-requiredfields)
     */
    public fun requiredFields(): Any? = unwrap(this).getRequiredFields()

    /**
     * A builder for [ConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invisibleFields Lists the fields that are invisible to agents.
       */
      public fun invisibleFields(invisibleFields: IResolvable)

      /**
       * @param invisibleFields Lists the fields that are invisible to agents.
       */
      public fun invisibleFields(invisibleFields: List<Any>)

      /**
       * @param invisibleFields Lists the fields that are invisible to agents.
       */
      public fun invisibleFields(vararg invisibleFields: Any)

      /**
       * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
       */
      public fun readOnlyFields(readOnlyFields: IResolvable)

      /**
       * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
       */
      public fun readOnlyFields(readOnlyFields: List<Any>)

      /**
       * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
       */
      public fun readOnlyFields(vararg readOnlyFields: Any)

      /**
       * @param requiredFields Lists the fields that are required to be filled by agents.
       */
      public fun requiredFields(requiredFields: IResolvable)

      /**
       * @param requiredFields Lists the fields that are required to be filled by agents.
       */
      public fun requiredFields(requiredFields: List<Any>)

      /**
       * @param requiredFields Lists the fields that are required to be filled by agents.
       */
      public fun requiredFields(vararg requiredFields: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty.builder()

      /**
       * @param invisibleFields Lists the fields that are invisible to agents.
       */
      override fun invisibleFields(invisibleFields: IResolvable) {
        cdkBuilder.invisibleFields(invisibleFields.let(IResolvable::unwrap))
      }

      /**
       * @param invisibleFields Lists the fields that are invisible to agents.
       */
      override fun invisibleFields(invisibleFields: List<Any>) {
        cdkBuilder.invisibleFields(invisibleFields)
      }

      /**
       * @param invisibleFields Lists the fields that are invisible to agents.
       */
      override fun invisibleFields(vararg invisibleFields: Any): Unit =
          invisibleFields(invisibleFields.toList())

      /**
       * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
       */
      override fun readOnlyFields(readOnlyFields: IResolvable) {
        cdkBuilder.readOnlyFields(readOnlyFields.let(IResolvable::unwrap))
      }

      /**
       * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
       */
      override fun readOnlyFields(readOnlyFields: List<Any>) {
        cdkBuilder.readOnlyFields(readOnlyFields)
      }

      /**
       * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
       */
      override fun readOnlyFields(vararg readOnlyFields: Any): Unit =
          readOnlyFields(readOnlyFields.toList())

      /**
       * @param requiredFields Lists the fields that are required to be filled by agents.
       */
      override fun requiredFields(requiredFields: IResolvable) {
        cdkBuilder.requiredFields(requiredFields.let(IResolvable::unwrap))
      }

      /**
       * @param requiredFields Lists the fields that are required to be filled by agents.
       */
      override fun requiredFields(requiredFields: List<Any>) {
        cdkBuilder.requiredFields(requiredFields)
      }

      /**
       * @param requiredFields Lists the fields that are required to be filled by agents.
       */
      override fun requiredFields(vararg requiredFields: Any): Unit =
          requiredFields(requiredFields.toList())

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty,
    ) : ConstraintsProperty {
      /**
       * Lists the fields that are invisible to agents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html#cfn-connect-tasktemplate-constraints-invisiblefields)
       */
      override fun invisibleFields(): Any? = unwrap(this).getInvisibleFields()

      /**
       * Lists the fields that are read-only to agents, and cannot be edited.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html#cfn-connect-tasktemplate-constraints-readonlyfields)
       */
      override fun readOnlyFields(): Any? = unwrap(this).getReadOnlyFields()

      /**
       * Lists the fields that are required to be filled by agents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html#cfn-connect-tasktemplate-constraints-requiredfields)
       */
      override fun requiredFields(): Any? = unwrap(this).getRequiredFields()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty):
          ConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ConstraintsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReadOnlyFieldInfoProperty {
    /**
     * Identifier of the read-only field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-readonlyfieldinfo.html#cfn-connect-tasktemplate-readonlyfieldinfo-id)
     */
    public fun id(): Any

    /**
     * A builder for [ReadOnlyFieldInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id Identifier of the read-only field. 
       */
      public fun id(id: IResolvable)

      /**
       * @param id Identifier of the read-only field. 
       */
      public fun id(id: FieldIdentifierProperty)

      /**
       * @param id Identifier of the read-only field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62689dfc63505ec8df9de67e713658e1b9f5019543d4f2c930a752c0e12feb1a")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty.builder()

      /**
       * @param id Identifier of the read-only field. 
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      /**
       * @param id Identifier of the read-only field. 
       */
      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param id Identifier of the read-only field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("62689dfc63505ec8df9de67e713658e1b9f5019543d4f2c930a752c0e12feb1a")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty,
    ) : ReadOnlyFieldInfoProperty {
      /**
       * Identifier of the read-only field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-readonlyfieldinfo.html#cfn-connect-tasktemplate-readonlyfieldinfo-id)
       */
      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReadOnlyFieldInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty):
          ReadOnlyFieldInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReadOnlyFieldInfoProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.ReadOnlyFieldInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InvisibleFieldInfoProperty {
    /**
     * Identifier of the invisible field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-invisiblefieldinfo.html#cfn-connect-tasktemplate-invisiblefieldinfo-id)
     */
    public fun id(): Any

    /**
     * A builder for [InvisibleFieldInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id Identifier of the invisible field. 
       */
      public fun id(id: IResolvable)

      /**
       * @param id Identifier of the invisible field. 
       */
      public fun id(id: FieldIdentifierProperty)

      /**
       * @param id Identifier of the invisible field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("595a9185f3657f68dc84ba9a245b870ebf1d340eca4be71300cb705dffa39baf")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty.builder()

      /**
       * @param id Identifier of the invisible field. 
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      /**
       * @param id Identifier of the invisible field. 
       */
      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param id Identifier of the invisible field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("595a9185f3657f68dc84ba9a245b870ebf1d340eca4be71300cb705dffa39baf")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty,
    ) : InvisibleFieldInfoProperty {
      /**
       * Identifier of the invisible field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-invisiblefieldinfo.html#cfn-connect-tasktemplate-invisiblefieldinfo-id)
       */
      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InvisibleFieldInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty):
          InvisibleFieldInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InvisibleFieldInfoProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.InvisibleFieldInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultFieldValueProperty {
    /**
     * Default value for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-defaultfieldvalue.html#cfn-connect-tasktemplate-defaultfieldvalue-defaultvalue)
     */
    public fun defaultValue(): String

    /**
     * Identifier of a field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-defaultfieldvalue.html#cfn-connect-tasktemplate-defaultfieldvalue-id)
     */
    public fun id(): Any

    /**
     * A builder for [DefaultFieldValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValue Default value for the field. 
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param id Identifier of a field. 
       */
      public fun id(id: IResolvable)

      /**
       * @param id Identifier of a field. 
       */
      public fun id(id: FieldIdentifierProperty)

      /**
       * @param id Identifier of a field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a641d5821b49176a7de21161e83fed0f337327041ba007397f80149101d69a4")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty.builder()

      /**
       * @param defaultValue Default value for the field. 
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param id Identifier of a field. 
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      /**
       * @param id Identifier of a field. 
       */
      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param id Identifier of a field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a641d5821b49176a7de21161e83fed0f337327041ba007397f80149101d69a4")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty,
    ) : DefaultFieldValueProperty {
      /**
       * Default value for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-defaultfieldvalue.html#cfn-connect-tasktemplate-defaultfieldvalue-defaultvalue)
       */
      override fun defaultValue(): String = unwrap(this).getDefaultValue()

      /**
       * Identifier of a field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-defaultfieldvalue.html#cfn-connect-tasktemplate-defaultfieldvalue-id)
       */
      override fun id(): Any = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultFieldValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty):
          DefaultFieldValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultFieldValueProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.DefaultFieldValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldIdentifierProperty {
    /**
     * The name of the task template field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-fieldidentifier.html#cfn-connect-tasktemplate-fieldidentifier-name)
     */
    public fun name(): String

    /**
     * A builder for [FieldIdentifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the task template field. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty.builder()

      /**
       * @param name The name of the task template field. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty,
    ) : FieldIdentifierProperty {
      /**
       * The name of the task template field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-fieldidentifier.html#cfn-connect-tasktemplate-fieldidentifier-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty):
          FieldIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldIdentifierProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldIdentifierProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FieldProperty {
    /**
     * The description of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique identifier for the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-id)
     */
    public fun id(): Any

    /**
     * A list of options for a single select field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-singleselectoptions)
     */
    public fun singleSelectOptions(): List<String> = unwrap(this).getSingleSelectOptions() ?:
        emptyList()

    /**
     * Indicates the type of field.
     *
     * Following are the valid field types: `NAME` `DESCRIPTION` | `SCHEDULED_TIME` |
     * `QUICK_CONNECT` | `URL` | `NUMBER` | `TEXT` | `TEXT_AREA` | `DATE_TIME` | `BOOLEAN` |
     * `SINGLE_SELECT` | `EMAIL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-type)
     */
    public fun type(): String

    /**
     * A builder for [FieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the field.
       */
      public fun description(description: String)

      /**
       * @param id The unique identifier for the field. 
       */
      public fun id(id: IResolvable)

      /**
       * @param id The unique identifier for the field. 
       */
      public fun id(id: FieldIdentifierProperty)

      /**
       * @param id The unique identifier for the field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8abd2ef8cb7d810f8ff05bbbc72275cbd60f0a6e284373767670f54b8b76e42")
      public fun id(id: FieldIdentifierProperty.Builder.() -> Unit)

      /**
       * @param singleSelectOptions A list of options for a single select field.
       */
      public fun singleSelectOptions(singleSelectOptions: List<String>)

      /**
       * @param singleSelectOptions A list of options for a single select field.
       */
      public fun singleSelectOptions(vararg singleSelectOptions: String)

      /**
       * @param type Indicates the type of field. 
       * Following are the valid field types: `NAME` `DESCRIPTION` | `SCHEDULED_TIME` |
       * `QUICK_CONNECT` | `URL` | `NUMBER` | `TEXT` | `TEXT_AREA` | `DATE_TIME` | `BOOLEAN` |
       * `SINGLE_SELECT` | `EMAIL`
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty.Builder =
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty.builder()

      /**
       * @param description The description of the field.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param id The unique identifier for the field. 
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      /**
       * @param id The unique identifier for the field. 
       */
      override fun id(id: FieldIdentifierProperty) {
        cdkBuilder.id(id.let(FieldIdentifierProperty::unwrap))
      }

      /**
       * @param id The unique identifier for the field. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8abd2ef8cb7d810f8ff05bbbc72275cbd60f0a6e284373767670f54b8b76e42")
      override fun id(id: FieldIdentifierProperty.Builder.() -> Unit): Unit =
          id(FieldIdentifierProperty(id))

      /**
       * @param singleSelectOptions A list of options for a single select field.
       */
      override fun singleSelectOptions(singleSelectOptions: List<String>) {
        cdkBuilder.singleSelectOptions(singleSelectOptions)
      }

      /**
       * @param singleSelectOptions A list of options for a single select field.
       */
      override fun singleSelectOptions(vararg singleSelectOptions: String): Unit =
          singleSelectOptions(singleSelectOptions.toList())

      /**
       * @param type Indicates the type of field. 
       * Following are the valid field types: `NAME` `DESCRIPTION` | `SCHEDULED_TIME` |
       * `QUICK_CONNECT` | `URL` | `NUMBER` | `TEXT` | `TEXT_AREA` | `DATE_TIME` | `BOOLEAN` |
       * `SINGLE_SELECT` | `EMAIL`
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty,
    ) : FieldProperty {
      /**
       * The description of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The unique identifier for the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-id)
       */
      override fun id(): Any = unwrap(this).getId()

      /**
       * A list of options for a single select field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-singleselectoptions)
       */
      override fun singleSelectOptions(): List<String> = unwrap(this).getSingleSelectOptions() ?:
          emptyList()

      /**
       * Indicates the type of field.
       *
       * Following are the valid field types: `NAME` `DESCRIPTION` | `SCHEDULED_TIME` |
       * `QUICK_CONNECT` | `URL` | `NUMBER` | `TEXT` | `TEXT_AREA` | `DATE_TIME` | `BOOLEAN` |
       * `SINGLE_SELECT` | `EMAIL`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html#cfn-connect-tasktemplate-field-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty):
          FieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldProperty):
          software.amazon.awscdk.services.connect.CfnTaskTemplate.FieldProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
