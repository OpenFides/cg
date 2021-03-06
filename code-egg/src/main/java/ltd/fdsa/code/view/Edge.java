package ltd.fdsa.code.view;

import lombok.Data;

@Data
public class Edge {
    String shape;
    String name;
    String source;
    String target;
    String id;
    Point[] controlPoints;
    int sourceAnchor;
    int targetAnchor;
}
