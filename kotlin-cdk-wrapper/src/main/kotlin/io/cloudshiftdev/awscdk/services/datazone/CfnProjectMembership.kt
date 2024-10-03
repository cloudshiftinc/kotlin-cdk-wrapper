@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataZone::ProjectMembership` resource adds a member to an Amazon DataZone project.
 *
 * Project members consume assets from the Amazon DataZone catalog and produce new assets using one
 * or more analytical workflows.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnProjectMembership cfnProjectMembership = CfnProjectMembership.Builder.create(this,
 * "MyCfnProjectMembership")
 * .designation("designation")
 * .domainIdentifier("domainIdentifier")
 * .member(MemberProperty.builder()
 * .groupIdentifier("groupIdentifier")
 * .userIdentifier("userIdentifier")
 * .build())
 * .projectIdentifier("projectIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html)
 */
public open class CfnProjectMembership(
  cdkObject: software.amazon.awscdk.services.datazone.CfnProjectMembership,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectMembershipProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnProjectMembership(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProjectMembershipProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectMembershipProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProjectMembershipProps(props)
  )

  /**
   * The designated role of a project member.
   */
  public open fun designation(): String = unwrap(this).getDesignation()

  /**
   * The designated role of a project member.
   */
  public open fun designation(`value`: String) {
    unwrap(this).setDesignation(`value`)
  }

  /**
   * The ID of the Amazon DataZone domain in which project membership is created.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The ID of the Amazon DataZone domain in which project membership is created.
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
   * The details about a project member.
   */
  public open fun member(): Any = unwrap(this).getMember()

  /**
   * The details about a project member.
   */
  public open fun member(`value`: IResolvable) {
    unwrap(this).setMember(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The details about a project member.
   */
  public open fun member(`value`: MemberProperty) {
    unwrap(this).setMember(`value`.let(MemberProperty.Companion::unwrap))
  }

  /**
   * The details about a project member.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7ab5b3968ef2e82af7d7d0ec6a4904ffb6cf66caa87ece05eb0b8e4fe95c4e3")
  public open fun member(`value`: MemberProperty.Builder.() -> Unit): Unit =
      member(MemberProperty(`value`))

  /**
   * The ID of the project for which this project membership was created.
   */
  public open fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

  /**
   * The ID of the project for which this project membership was created.
   */
  public open fun projectIdentifier(`value`: String) {
    unwrap(this).setProjectIdentifier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnProjectMembership].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The designated role of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-designation)
     * @param designation The designated role of a project member. 
     */
    public fun designation(designation: String)

    /**
     * The ID of the Amazon DataZone domain in which project membership is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-domainidentifier)
     * @param domainIdentifier The ID of the Amazon DataZone domain in which project membership is
     * created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The details about a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
     * @param member The details about a project member. 
     */
    public fun member(member: IResolvable)

    /**
     * The details about a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
     * @param member The details about a project member. 
     */
    public fun member(member: MemberProperty)

    /**
     * The details about a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
     * @param member The details about a project member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b2b4da8f6cdbf2dc3b01a814753d1c4baeff63777b990f5f2e30e0cbad36712")
    public fun member(member: MemberProperty.Builder.() -> Unit)

    /**
     * The ID of the project for which this project membership was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-projectidentifier)
     * @param projectIdentifier The ID of the project for which this project membership was created.
     * 
     */
    public fun projectIdentifier(projectIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProjectMembership.Builder =
        software.amazon.awscdk.services.datazone.CfnProjectMembership.Builder.create(scope, id)

    /**
     * The designated role of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-designation)
     * @param designation The designated role of a project member. 
     */
    override fun designation(designation: String) {
      cdkBuilder.designation(designation)
    }

    /**
     * The ID of the Amazon DataZone domain in which project membership is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-domainidentifier)
     * @param domainIdentifier The ID of the Amazon DataZone domain in which project membership is
     * created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The details about a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
     * @param member The details about a project member. 
     */
    override fun member(member: IResolvable) {
      cdkBuilder.member(member.let(IResolvable.Companion::unwrap))
    }

    /**
     * The details about a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
     * @param member The details about a project member. 
     */
    override fun member(member: MemberProperty) {
      cdkBuilder.member(member.let(MemberProperty.Companion::unwrap))
    }

    /**
     * The details about a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-member)
     * @param member The details about a project member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b2b4da8f6cdbf2dc3b01a814753d1c4baeff63777b990f5f2e30e0cbad36712")
    override fun member(member: MemberProperty.Builder.() -> Unit): Unit =
        member(MemberProperty(member))

    /**
     * The ID of the project for which this project membership was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-projectmembership.html#cfn-datazone-projectmembership-projectidentifier)
     * @param projectIdentifier The ID of the project for which this project membership was created.
     * 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProjectMembership =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnProjectMembership.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProjectMembership {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProjectMembership(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectMembership):
        CfnProjectMembership = CfnProjectMembership(cdkObject)

    internal fun unwrap(wrapped: CfnProjectMembership):
        software.amazon.awscdk.services.datazone.CfnProjectMembership = wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnProjectMembership
  }

  /**
   * The details about a project member.
   *
   * Important - this data type is a UNION, so only one of the following members can be specified
   * when used or returned.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * MemberProperty memberProperty = MemberProperty.builder()
   * .groupIdentifier("groupIdentifier")
   * .userIdentifier("userIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectmembership-member.html)
   */
  public interface MemberProperty {
    /**
     * The ID of the group of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectmembership-member.html#cfn-datazone-projectmembership-member-groupidentifier)
     */
    public fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()

    /**
     * The user ID of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectmembership-member.html#cfn-datazone-projectmembership-member-useridentifier)
     */
    public fun userIdentifier(): String? = unwrap(this).getUserIdentifier()

    /**
     * A builder for [MemberProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupIdentifier The ID of the group of a project member.
       */
      public fun groupIdentifier(groupIdentifier: String)

      /**
       * @param userIdentifier The user ID of a project member.
       */
      public fun userIdentifier(userIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnProjectMembership.MemberProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnProjectMembership.MemberProperty.builder()

      /**
       * @param groupIdentifier The ID of the group of a project member.
       */
      override fun groupIdentifier(groupIdentifier: String) {
        cdkBuilder.groupIdentifier(groupIdentifier)
      }

      /**
       * @param userIdentifier The user ID of a project member.
       */
      override fun userIdentifier(userIdentifier: String) {
        cdkBuilder.userIdentifier(userIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnProjectMembership.MemberProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnProjectMembership.MemberProperty,
    ) : CdkObject(cdkObject),
        MemberProperty {
      /**
       * The ID of the group of a project member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectmembership-member.html#cfn-datazone-projectmembership-member-groupidentifier)
       */
      override fun groupIdentifier(): String? = unwrap(this).getGroupIdentifier()

      /**
       * The user ID of a project member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-projectmembership-member.html#cfn-datazone-projectmembership-member-useridentifier)
       */
      override fun userIdentifier(): String? = unwrap(this).getUserIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectMembership.MemberProperty):
          MemberProperty = CdkObjectWrappers.wrap(cdkObject) as? MemberProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberProperty):
          software.amazon.awscdk.services.datazone.CfnProjectMembership.MemberProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnProjectMembership.MemberProperty
    }
  }
}
