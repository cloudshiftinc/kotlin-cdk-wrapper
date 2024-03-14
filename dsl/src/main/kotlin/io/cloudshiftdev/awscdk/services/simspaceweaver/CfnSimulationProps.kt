package io.cloudshiftdev.awscdk.services.simspaceweaver

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSimulationProps {
  /**
   * The maximum running time of the simulation, specified as a number of minutes (m or M), hours (h
   * or H), or days (d or D).
   *
   * The simulation stops when it reaches this limit. The maximum value is `14D` , or its equivalent
   * in the other units. The default value is `14D` . A value equivalent to `0` makes the simulation
   * immediately transition to `STOPPING` as soon as it reaches `STARTED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-maximumduration)
   */
  public fun maximumDuration(): String? = unwrap(this).getMaximumDuration()

  /**
   * The name of the simulation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role that the
   * simulation assumes to perform actions.
   *
   * For more information about ARNs, see [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
   * General Reference* . For more information about IAM roles, see [IAM
   * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *AWS Identity and
   * Access Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-rolearn)
   */
  public fun roleArn(): String

  /**
   * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
   *
   * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
   *
   * Provide a `SchemaS3Location` to start your simulation from a schema.
   *
   * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
   */
  public fun schemaS3Location(): Any? = unwrap(this).getSchemaS3Location()

  /**
   * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
   *
   * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
   *
   * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
   *
   * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
   */
  public fun snapshotS3Location(): Any? = unwrap(this).getSnapshotS3Location()

  /**
   * A builder for [CfnSimulationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maximumDuration The maximum running time of the simulation, specified as a number of
     * minutes (m or M), hours (h or H), or days (d or D).
     * The simulation stops when it reaches this limit. The maximum value is `14D` , or its
     * equivalent in the other units. The default value is `14D` . A value equivalent to `0` makes the
     * simulation immediately transition to `STOPPING` as soon as it reaches `STARTED` .
     */
    public fun maximumDuration(maximumDuration: String)

    /**
     * @param name The name of the simulation. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM
     * ) role that the simulation assumes to perform actions. 
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* . For more information about IAM roles, see [IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *AWS Identity and
     * Access Management User Guide* .
     */
    public fun roleArn(roleArn: String)

    /**
     * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
     * Service ( Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SchemaS3Location` to start your simulation from a schema.
     *
     * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
     */
    public fun schemaS3Location(schemaS3Location: IResolvable)

    /**
     * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
     * Service ( Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SchemaS3Location` to start your simulation from a schema.
     *
     * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
     */
    public fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty)

    /**
     * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
     * Service ( Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SchemaS3Location` to start your simulation from a schema.
     *
     * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("329650b038bc911b7f9901b7d863c8ab3909b484f2584d97b98d9b94711c4999")
    public
        fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
     * Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
     *
     * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
     */
    public fun snapshotS3Location(snapshotS3Location: IResolvable)

    /**
     * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
     * Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
     *
     * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
     */
    public fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty)

    /**
     * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
     * Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
     *
     * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee7dc33f6a24012fabc13cedda102ef77c2c81e1ce1d75802f2cf9f74c30cf4b")
    public
        fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps.Builder =
        software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps.builder()

    /**
     * @param maximumDuration The maximum running time of the simulation, specified as a number of
     * minutes (m or M), hours (h or H), or days (d or D).
     * The simulation stops when it reaches this limit. The maximum value is `14D` , or its
     * equivalent in the other units. The default value is `14D` . A value equivalent to `0` makes the
     * simulation immediately transition to `STOPPING` as soon as it reaches `STARTED` .
     */
    override fun maximumDuration(maximumDuration: String) {
      cdkBuilder.maximumDuration(maximumDuration)
    }

    /**
     * @param name The name of the simulation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM
     * ) role that the simulation assumes to perform actions. 
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* . For more information about IAM roles, see [IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *AWS Identity and
     * Access Management User Guide* .
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
     * Service ( Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SchemaS3Location` to start your simulation from a schema.
     *
     * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
     */
    override fun schemaS3Location(schemaS3Location: IResolvable) {
      cdkBuilder.schemaS3Location(schemaS3Location.let(IResolvable::unwrap))
    }

    /**
     * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
     * Service ( Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SchemaS3Location` to start your simulation from a schema.
     *
     * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
     */
    override fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty) {
      cdkBuilder.schemaS3Location(schemaS3Location.let(CfnSimulation.S3LocationProperty::unwrap))
    }

    /**
     * @param schemaS3Location The location of the simulation schema in Amazon Simple Storage
     * Service ( Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SchemaS3Location` to start your simulation from a schema.
     *
     * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("329650b038bc911b7f9901b7d863c8ab3909b484f2584d97b98d9b94711c4999")
    override
        fun schemaS3Location(schemaS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit):
        Unit = schemaS3Location(CfnSimulation.S3LocationProperty(schemaS3Location))

    /**
     * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
     * Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
     *
     * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
     */
    override fun snapshotS3Location(snapshotS3Location: IResolvable) {
      cdkBuilder.snapshotS3Location(snapshotS3Location.let(IResolvable::unwrap))
    }

    /**
     * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
     * Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
     *
     * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
     */
    override fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty) {
      cdkBuilder.snapshotS3Location(snapshotS3Location.let(CfnSimulation.S3LocationProperty::unwrap))
    }

    /**
     * @param snapshotS3Location The location of the snapshot in Amazon Simple Storage Service (
     * Amazon S3 ).
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
     *
     * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee7dc33f6a24012fabc13cedda102ef77c2c81e1ce1d75802f2cf9f74c30cf4b")
    override
        fun snapshotS3Location(snapshotS3Location: CfnSimulation.S3LocationProperty.Builder.() -> Unit):
        Unit = snapshotS3Location(CfnSimulation.S3LocationProperty(snapshotS3Location))

    public fun build(): software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps,
  ) : CdkObject(cdkObject), CfnSimulationProps {
    /**
     * The maximum running time of the simulation, specified as a number of minutes (m or M), hours
     * (h or H), or days (d or D).
     *
     * The simulation stops when it reaches this limit. The maximum value is `14D` , or its
     * equivalent in the other units. The default value is `14D` . A value equivalent to `0` makes the
     * simulation immediately transition to `STOPPING` as soon as it reaches `STARTED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-maximumduration)
     */
    override fun maximumDuration(): String? = unwrap(this).getMaximumDuration()

    /**
     * The name of the simulation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role that
     * the simulation assumes to perform actions.
     *
     * For more information about ARNs, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* . For more information about IAM roles, see [IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *AWS Identity and
     * Access Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The location of the simulation schema in Amazon Simple Storage Service ( Amazon S3 ).
     *
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SchemaS3Location` to start your simulation from a schema.
     *
     * If you provide a `SchemaS3Location` then you can't provide a `SnapshotS3Location` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-schemas3location)
     */
    override fun schemaS3Location(): Any? = unwrap(this).getSchemaS3Location()

    /**
     * The location of the snapshot in Amazon Simple Storage Service ( Amazon S3 ).
     *
     * For more information about Amazon S3 , see the [*Amazon Simple Storage Service User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html) .
     *
     * Provide a `SnapshotS3Location` to start your simulation from a snapshot.
     *
     * If you provide a `SnapshotS3Location` then you can't provide a `SchemaS3Location` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-simspaceweaver-simulation.html#cfn-simspaceweaver-simulation-snapshots3location)
     */
    override fun snapshotS3Location(): Any? = unwrap(this).getSnapshotS3Location()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSimulationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps):
        CfnSimulationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationProps):
        software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps
  }
}
