@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

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
 * Contains information about a hierarchy structure.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnUserHierarchyStructure cfnUserHierarchyStructure =
 * CfnUserHierarchyStructure.Builder.create(this, "MyCfnUserHierarchyStructure")
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .userHierarchyStructure(UserHierarchyStructureProperty.builder()
 * .levelFive(LevelFiveProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelFour(LevelFourProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelOne(LevelOneProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelThree(LevelThreeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .levelTwo(LevelTwoProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hierarchyLevelArn("hierarchyLevelArn")
 * .hierarchyLevelId("hierarchyLevelId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html)
 */
public open class CfnUserHierarchyStructure(
  cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserHierarchyStructureProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnUserHierarchyStructure(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserHierarchyStructureProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserHierarchyStructureProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserHierarchyStructureProps(props)
  )

  /**
   * The identifier for the user hierarchy structure.
   */
  public open fun attrUserHierarchyStructureArn(): String =
      unwrap(this).getAttrUserHierarchyStructureArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * Contains information about a hierarchy structure.
   */
  public open fun userHierarchyStructure(): Any? = unwrap(this).getUserHierarchyStructure()

  /**
   * Contains information about a hierarchy structure.
   */
  public open fun userHierarchyStructure(`value`: IResolvable) {
    unwrap(this).setUserHierarchyStructure(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains information about a hierarchy structure.
   */
  public open fun userHierarchyStructure(`value`: UserHierarchyStructureProperty) {
    unwrap(this).setUserHierarchyStructure(`value`.let(UserHierarchyStructureProperty.Companion::unwrap))
  }

  /**
   * Contains information about a hierarchy structure.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a3d9a0a00232bb8aac62303657597d0666b3294d08d99c79fd83730ad2545ccd")
  public open
      fun userHierarchyStructure(`value`: UserHierarchyStructureProperty.Builder.() -> Unit): Unit =
      userHierarchyStructure(UserHierarchyStructureProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnUserHierarchyStructure].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * Contains information about a hierarchy structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
     * @param userHierarchyStructure Contains information about a hierarchy structure. 
     */
    public fun userHierarchyStructure(userHierarchyStructure: IResolvable)

    /**
     * Contains information about a hierarchy structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
     * @param userHierarchyStructure Contains information about a hierarchy structure. 
     */
    public fun userHierarchyStructure(userHierarchyStructure: UserHierarchyStructureProperty)

    /**
     * Contains information about a hierarchy structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
     * @param userHierarchyStructure Contains information about a hierarchy structure. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9275a8fda88abe4afc4969810d23a16125bbf41bda2d16dbe10b0c62960632ce")
    public
        fun userHierarchyStructure(userHierarchyStructure: UserHierarchyStructureProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.Builder =
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * Contains information about a hierarchy structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
     * @param userHierarchyStructure Contains information about a hierarchy structure. 
     */
    override fun userHierarchyStructure(userHierarchyStructure: IResolvable) {
      cdkBuilder.userHierarchyStructure(userHierarchyStructure.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains information about a hierarchy structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
     * @param userHierarchyStructure Contains information about a hierarchy structure. 
     */
    override fun userHierarchyStructure(userHierarchyStructure: UserHierarchyStructureProperty) {
      cdkBuilder.userHierarchyStructure(userHierarchyStructure.let(UserHierarchyStructureProperty.Companion::unwrap))
    }

    /**
     * Contains information about a hierarchy structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure)
     * @param userHierarchyStructure Contains information about a hierarchy structure. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9275a8fda88abe4afc4969810d23a16125bbf41bda2d16dbe10b0c62960632ce")
    override
        fun userHierarchyStructure(userHierarchyStructure: UserHierarchyStructureProperty.Builder.() -> Unit):
        Unit = userHierarchyStructure(UserHierarchyStructureProperty(userHierarchyStructure))

    public fun build(): software.amazon.awscdk.services.connect.CfnUserHierarchyStructure =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserHierarchyStructure {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserHierarchyStructure(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure):
        CfnUserHierarchyStructure = CfnUserHierarchyStructure(cdkObject)

    internal fun unwrap(wrapped: CfnUserHierarchyStructure):
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructure = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnUserHierarchyStructure
  }

  /**
   * The update for level five.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * LevelFiveProperty levelFiveProperty = LevelFiveProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfive.html)
   */
  public interface LevelFiveProperty {
    /**
     * The Amazon Resource Name (ARN) of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfive.html#cfn-connect-userhierarchystructure-levelfive-hierarchylevelarn)
     */
    public fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

    /**
     * The identifier of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfive.html#cfn-connect-userhierarchystructure-levelfive-hierarchylevelid)
     */
    public fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

    /**
     * The name of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfive.html#cfn-connect-userhierarchystructure-levelfive-name)
     */
    public fun name(): String

    /**
     * A builder for [LevelFiveProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      public fun hierarchyLevelArn(hierarchyLevelArn: String)

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      public fun hierarchyLevelId(hierarchyLevelId: String)

      /**
       * @param name The name of the hierarchy level. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFiveProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFiveProperty.builder()

      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      override fun hierarchyLevelArn(hierarchyLevelArn: String) {
        cdkBuilder.hierarchyLevelArn(hierarchyLevelArn)
      }

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      override fun hierarchyLevelId(hierarchyLevelId: String) {
        cdkBuilder.hierarchyLevelId(hierarchyLevelId)
      }

      /**
       * @param name The name of the hierarchy level. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFiveProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFiveProperty,
    ) : CdkObject(cdkObject),
        LevelFiveProperty {
      /**
       * The Amazon Resource Name (ARN) of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfive.html#cfn-connect-userhierarchystructure-levelfive-hierarchylevelarn)
       */
      override fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

      /**
       * The identifier of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfive.html#cfn-connect-userhierarchystructure-levelfive-hierarchylevelid)
       */
      override fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

      /**
       * The name of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfive.html#cfn-connect-userhierarchystructure-levelfive-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LevelFiveProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFiveProperty):
          LevelFiveProperty = CdkObjectWrappers.wrap(cdkObject) as? LevelFiveProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LevelFiveProperty):
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFiveProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFiveProperty
    }
  }

  /**
   * The update for level four.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * LevelFourProperty levelFourProperty = LevelFourProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfour.html)
   */
  public interface LevelFourProperty {
    /**
     * The Amazon Resource Name (ARN) of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfour.html#cfn-connect-userhierarchystructure-levelfour-hierarchylevelarn)
     */
    public fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

    /**
     * The identifier of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfour.html#cfn-connect-userhierarchystructure-levelfour-hierarchylevelid)
     */
    public fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

    /**
     * The name of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfour.html#cfn-connect-userhierarchystructure-levelfour-name)
     */
    public fun name(): String

    /**
     * A builder for [LevelFourProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      public fun hierarchyLevelArn(hierarchyLevelArn: String)

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      public fun hierarchyLevelId(hierarchyLevelId: String)

      /**
       * @param name The name of the hierarchy level. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFourProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFourProperty.builder()

      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      override fun hierarchyLevelArn(hierarchyLevelArn: String) {
        cdkBuilder.hierarchyLevelArn(hierarchyLevelArn)
      }

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      override fun hierarchyLevelId(hierarchyLevelId: String) {
        cdkBuilder.hierarchyLevelId(hierarchyLevelId)
      }

      /**
       * @param name The name of the hierarchy level. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFourProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFourProperty,
    ) : CdkObject(cdkObject),
        LevelFourProperty {
      /**
       * The Amazon Resource Name (ARN) of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfour.html#cfn-connect-userhierarchystructure-levelfour-hierarchylevelarn)
       */
      override fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

      /**
       * The identifier of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfour.html#cfn-connect-userhierarchystructure-levelfour-hierarchylevelid)
       */
      override fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

      /**
       * The name of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelfour.html#cfn-connect-userhierarchystructure-levelfour-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LevelFourProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFourProperty):
          LevelFourProperty = CdkObjectWrappers.wrap(cdkObject) as? LevelFourProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LevelFourProperty):
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFourProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelFourProperty
    }
  }

  /**
   * Information about level one.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * LevelOneProperty levelOneProperty = LevelOneProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelone.html)
   */
  public interface LevelOneProperty {
    /**
     * The Amazon Resource Name (ARN) of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelone.html#cfn-connect-userhierarchystructure-levelone-hierarchylevelarn)
     */
    public fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

    /**
     * The identifier of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelone.html#cfn-connect-userhierarchystructure-levelone-hierarchylevelid)
     */
    public fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

    /**
     * The name of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelone.html#cfn-connect-userhierarchystructure-levelone-name)
     */
    public fun name(): String

    /**
     * A builder for [LevelOneProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      public fun hierarchyLevelArn(hierarchyLevelArn: String)

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      public fun hierarchyLevelId(hierarchyLevelId: String)

      /**
       * @param name The name of the hierarchy level. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelOneProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelOneProperty.builder()

      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      override fun hierarchyLevelArn(hierarchyLevelArn: String) {
        cdkBuilder.hierarchyLevelArn(hierarchyLevelArn)
      }

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      override fun hierarchyLevelId(hierarchyLevelId: String) {
        cdkBuilder.hierarchyLevelId(hierarchyLevelId)
      }

      /**
       * @param name The name of the hierarchy level. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelOneProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelOneProperty,
    ) : CdkObject(cdkObject),
        LevelOneProperty {
      /**
       * The Amazon Resource Name (ARN) of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelone.html#cfn-connect-userhierarchystructure-levelone-hierarchylevelarn)
       */
      override fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

      /**
       * The identifier of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelone.html#cfn-connect-userhierarchystructure-levelone-hierarchylevelid)
       */
      override fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

      /**
       * The name of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelone.html#cfn-connect-userhierarchystructure-levelone-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LevelOneProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelOneProperty):
          LevelOneProperty = CdkObjectWrappers.wrap(cdkObject) as? LevelOneProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LevelOneProperty):
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelOneProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelOneProperty
    }
  }

  /**
   * The update for level three.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * LevelThreeProperty levelThreeProperty = LevelThreeProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelthree.html)
   */
  public interface LevelThreeProperty {
    /**
     * The Amazon Resource Name (ARN) of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelthree.html#cfn-connect-userhierarchystructure-levelthree-hierarchylevelarn)
     */
    public fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

    /**
     * The identifier of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelthree.html#cfn-connect-userhierarchystructure-levelthree-hierarchylevelid)
     */
    public fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

    /**
     * The name of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelthree.html#cfn-connect-userhierarchystructure-levelthree-name)
     */
    public fun name(): String

    /**
     * A builder for [LevelThreeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      public fun hierarchyLevelArn(hierarchyLevelArn: String)

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      public fun hierarchyLevelId(hierarchyLevelId: String)

      /**
       * @param name The name of the hierarchy level. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelThreeProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelThreeProperty.builder()

      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      override fun hierarchyLevelArn(hierarchyLevelArn: String) {
        cdkBuilder.hierarchyLevelArn(hierarchyLevelArn)
      }

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      override fun hierarchyLevelId(hierarchyLevelId: String) {
        cdkBuilder.hierarchyLevelId(hierarchyLevelId)
      }

      /**
       * @param name The name of the hierarchy level. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelThreeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelThreeProperty,
    ) : CdkObject(cdkObject),
        LevelThreeProperty {
      /**
       * The Amazon Resource Name (ARN) of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelthree.html#cfn-connect-userhierarchystructure-levelthree-hierarchylevelarn)
       */
      override fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

      /**
       * The identifier of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelthree.html#cfn-connect-userhierarchystructure-levelthree-hierarchylevelid)
       */
      override fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

      /**
       * The name of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-levelthree.html#cfn-connect-userhierarchystructure-levelthree-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LevelThreeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelThreeProperty):
          LevelThreeProperty = CdkObjectWrappers.wrap(cdkObject) as? LevelThreeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LevelThreeProperty):
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelThreeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelThreeProperty
    }
  }

  /**
   * The update for level two.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * LevelTwoProperty levelTwoProperty = LevelTwoProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-leveltwo.html)
   */
  public interface LevelTwoProperty {
    /**
     * The Amazon Resource Name (ARN) of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-leveltwo.html#cfn-connect-userhierarchystructure-leveltwo-hierarchylevelarn)
     */
    public fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

    /**
     * The identifier of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-leveltwo.html#cfn-connect-userhierarchystructure-leveltwo-hierarchylevelid)
     */
    public fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

    /**
     * The name of the hierarchy level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-leveltwo.html#cfn-connect-userhierarchystructure-leveltwo-name)
     */
    public fun name(): String

    /**
     * A builder for [LevelTwoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      public fun hierarchyLevelArn(hierarchyLevelArn: String)

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      public fun hierarchyLevelId(hierarchyLevelId: String)

      /**
       * @param name The name of the hierarchy level. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelTwoProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelTwoProperty.builder()

      /**
       * @param hierarchyLevelArn The Amazon Resource Name (ARN) of the hierarchy level.
       */
      override fun hierarchyLevelArn(hierarchyLevelArn: String) {
        cdkBuilder.hierarchyLevelArn(hierarchyLevelArn)
      }

      /**
       * @param hierarchyLevelId The identifier of the hierarchy level.
       */
      override fun hierarchyLevelId(hierarchyLevelId: String) {
        cdkBuilder.hierarchyLevelId(hierarchyLevelId)
      }

      /**
       * @param name The name of the hierarchy level. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelTwoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelTwoProperty,
    ) : CdkObject(cdkObject),
        LevelTwoProperty {
      /**
       * The Amazon Resource Name (ARN) of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-leveltwo.html#cfn-connect-userhierarchystructure-leveltwo-hierarchylevelarn)
       */
      override fun hierarchyLevelArn(): String? = unwrap(this).getHierarchyLevelArn()

      /**
       * The identifier of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-leveltwo.html#cfn-connect-userhierarchystructure-leveltwo-hierarchylevelid)
       */
      override fun hierarchyLevelId(): String? = unwrap(this).getHierarchyLevelId()

      /**
       * The name of the hierarchy level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-leveltwo.html#cfn-connect-userhierarchystructure-leveltwo-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LevelTwoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelTwoProperty):
          LevelTwoProperty = CdkObjectWrappers.wrap(cdkObject) as? LevelTwoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LevelTwoProperty):
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelTwoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.LevelTwoProperty
    }
  }

  /**
   * Contains information about a hierarchy structure.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * UserHierarchyStructureProperty userHierarchyStructureProperty =
   * UserHierarchyStructureProperty.builder()
   * .levelFive(LevelFiveProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build())
   * .levelFour(LevelFourProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build())
   * .levelOne(LevelOneProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build())
   * .levelThree(LevelThreeProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build())
   * .levelTwo(LevelTwoProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hierarchyLevelArn("hierarchyLevelArn")
   * .hierarchyLevelId("hierarchyLevelId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html)
   */
  public interface UserHierarchyStructureProperty {
    /**
     * Information about level five.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelfive)
     */
    public fun levelFive(): Any? = unwrap(this).getLevelFive()

    /**
     * The update for level four.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelfour)
     */
    public fun levelFour(): Any? = unwrap(this).getLevelFour()

    /**
     * The update for level one.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelone)
     */
    public fun levelOne(): Any? = unwrap(this).getLevelOne()

    /**
     * The update for level three.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelthree)
     */
    public fun levelThree(): Any? = unwrap(this).getLevelThree()

    /**
     * The update for level two.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-leveltwo)
     */
    public fun levelTwo(): Any? = unwrap(this).getLevelTwo()

    /**
     * A builder for [UserHierarchyStructureProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param levelFive Information about level five.
       */
      public fun levelFive(levelFive: IResolvable)

      /**
       * @param levelFive Information about level five.
       */
      public fun levelFive(levelFive: LevelFiveProperty)

      /**
       * @param levelFive Information about level five.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1264f1291d0fec3141a0a19a7fc41b13fae34254c3deea908148d07be14afb4b")
      public fun levelFive(levelFive: LevelFiveProperty.Builder.() -> Unit)

      /**
       * @param levelFour The update for level four.
       */
      public fun levelFour(levelFour: IResolvable)

      /**
       * @param levelFour The update for level four.
       */
      public fun levelFour(levelFour: LevelFourProperty)

      /**
       * @param levelFour The update for level four.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d064776af69b42749acd9cae74bebbf2485de013b0eb55b0befdecdc6429697")
      public fun levelFour(levelFour: LevelFourProperty.Builder.() -> Unit)

      /**
       * @param levelOne The update for level one.
       */
      public fun levelOne(levelOne: IResolvable)

      /**
       * @param levelOne The update for level one.
       */
      public fun levelOne(levelOne: LevelOneProperty)

      /**
       * @param levelOne The update for level one.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("850046aa9fe9762272a56a42b0d9cb33515f4f7be1b6e96448d82633e0cba9e0")
      public fun levelOne(levelOne: LevelOneProperty.Builder.() -> Unit)

      /**
       * @param levelThree The update for level three.
       */
      public fun levelThree(levelThree: IResolvable)

      /**
       * @param levelThree The update for level three.
       */
      public fun levelThree(levelThree: LevelThreeProperty)

      /**
       * @param levelThree The update for level three.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6af44162f6f59e33642862122d40af1233d0823eb5452a4d55d1bfa64b64457a")
      public fun levelThree(levelThree: LevelThreeProperty.Builder.() -> Unit)

      /**
       * @param levelTwo The update for level two.
       */
      public fun levelTwo(levelTwo: IResolvable)

      /**
       * @param levelTwo The update for level two.
       */
      public fun levelTwo(levelTwo: LevelTwoProperty)

      /**
       * @param levelTwo The update for level two.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cc0aebb642447e5a1cb034d174ec8a54400e4f1c8271fde5ca88e8cfe587a27")
      public fun levelTwo(levelTwo: LevelTwoProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.UserHierarchyStructureProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.UserHierarchyStructureProperty.builder()

      /**
       * @param levelFive Information about level five.
       */
      override fun levelFive(levelFive: IResolvable) {
        cdkBuilder.levelFive(levelFive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param levelFive Information about level five.
       */
      override fun levelFive(levelFive: LevelFiveProperty) {
        cdkBuilder.levelFive(levelFive.let(LevelFiveProperty.Companion::unwrap))
      }

      /**
       * @param levelFive Information about level five.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1264f1291d0fec3141a0a19a7fc41b13fae34254c3deea908148d07be14afb4b")
      override fun levelFive(levelFive: LevelFiveProperty.Builder.() -> Unit): Unit =
          levelFive(LevelFiveProperty(levelFive))

      /**
       * @param levelFour The update for level four.
       */
      override fun levelFour(levelFour: IResolvable) {
        cdkBuilder.levelFour(levelFour.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param levelFour The update for level four.
       */
      override fun levelFour(levelFour: LevelFourProperty) {
        cdkBuilder.levelFour(levelFour.let(LevelFourProperty.Companion::unwrap))
      }

      /**
       * @param levelFour The update for level four.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d064776af69b42749acd9cae74bebbf2485de013b0eb55b0befdecdc6429697")
      override fun levelFour(levelFour: LevelFourProperty.Builder.() -> Unit): Unit =
          levelFour(LevelFourProperty(levelFour))

      /**
       * @param levelOne The update for level one.
       */
      override fun levelOne(levelOne: IResolvable) {
        cdkBuilder.levelOne(levelOne.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param levelOne The update for level one.
       */
      override fun levelOne(levelOne: LevelOneProperty) {
        cdkBuilder.levelOne(levelOne.let(LevelOneProperty.Companion::unwrap))
      }

      /**
       * @param levelOne The update for level one.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("850046aa9fe9762272a56a42b0d9cb33515f4f7be1b6e96448d82633e0cba9e0")
      override fun levelOne(levelOne: LevelOneProperty.Builder.() -> Unit): Unit =
          levelOne(LevelOneProperty(levelOne))

      /**
       * @param levelThree The update for level three.
       */
      override fun levelThree(levelThree: IResolvable) {
        cdkBuilder.levelThree(levelThree.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param levelThree The update for level three.
       */
      override fun levelThree(levelThree: LevelThreeProperty) {
        cdkBuilder.levelThree(levelThree.let(LevelThreeProperty.Companion::unwrap))
      }

      /**
       * @param levelThree The update for level three.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6af44162f6f59e33642862122d40af1233d0823eb5452a4d55d1bfa64b64457a")
      override fun levelThree(levelThree: LevelThreeProperty.Builder.() -> Unit): Unit =
          levelThree(LevelThreeProperty(levelThree))

      /**
       * @param levelTwo The update for level two.
       */
      override fun levelTwo(levelTwo: IResolvable) {
        cdkBuilder.levelTwo(levelTwo.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param levelTwo The update for level two.
       */
      override fun levelTwo(levelTwo: LevelTwoProperty) {
        cdkBuilder.levelTwo(levelTwo.let(LevelTwoProperty.Companion::unwrap))
      }

      /**
       * @param levelTwo The update for level two.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3cc0aebb642447e5a1cb034d174ec8a54400e4f1c8271fde5ca88e8cfe587a27")
      override fun levelTwo(levelTwo: LevelTwoProperty.Builder.() -> Unit): Unit =
          levelTwo(LevelTwoProperty(levelTwo))

      public fun build():
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.UserHierarchyStructureProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.UserHierarchyStructureProperty,
    ) : CdkObject(cdkObject),
        UserHierarchyStructureProperty {
      /**
       * Information about level five.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelfive)
       */
      override fun levelFive(): Any? = unwrap(this).getLevelFive()

      /**
       * The update for level four.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelfour)
       */
      override fun levelFour(): Any? = unwrap(this).getLevelFour()

      /**
       * The update for level one.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelone)
       */
      override fun levelOne(): Any? = unwrap(this).getLevelOne()

      /**
       * The update for level three.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-levelthree)
       */
      override fun levelThree(): Any? = unwrap(this).getLevelThree()

      /**
       * The update for level two.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-userhierarchystructure-userhierarchystructure.html#cfn-connect-userhierarchystructure-userhierarchystructure-leveltwo)
       */
      override fun levelTwo(): Any? = unwrap(this).getLevelTwo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserHierarchyStructureProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.UserHierarchyStructureProperty):
          UserHierarchyStructureProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UserHierarchyStructureProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserHierarchyStructureProperty):
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.UserHierarchyStructureProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnUserHierarchyStructure.UserHierarchyStructureProperty
    }
  }
}
