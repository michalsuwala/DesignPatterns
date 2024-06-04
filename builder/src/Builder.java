public interface Builder {
    public void prepareGround(int area);
    public void sowGrass(int area);
    public void plantTrees(String quantity);
    public void buildInfrastructure(String infrastructure);
    public void digPond();
    public Garden getResult();
}
